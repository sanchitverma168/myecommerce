const Eureka = require("eureka-js-client").Eureka;
// const eurekaHost = (process.env.EUREKA_CLIENT_SERVICEURL_DEFAULTZONE || '127.0.0.1');
const eurekaHost = "192.168.1.2";
const eurekaPort = 6200;
// const hostName = (process.env.HOSTNAME || 'localhost')
// const ipAddr = '172.0.0.1';

exports.registerWithEureka = function (appName, PORT) {
  const client = new Eureka({
    // application instance information
    instance: {
      app: appName,
      hostName: "payment-gateway",
      ipAddr: "192.168.1.2",
      port: {
        $: PORT,
        "@enabled": true,
      },
      vipAddress: appName,
      dataCenterInfo: {
        "@class": "com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo",
        name: "MyOwn",
      },
    },
    eureka: {
      // eureka server host / port
      host: eurekaHost,
      port: eurekaPort,
      preferIpAddress: true,
      maxRetries: 10,
      requestRetryDelay: 2000,
    },
  });

  client.logger.level("debug");
  client.start((error) => {
    console.log(error || "user service registered");
  });

  function exitHandler(options, exitCode) {
    if (options.cleanup) {
    }
    if (exitCode || exitCode === 0) console.log(exitCode);
    if (options.exit) {
      client.stop();
    }
  }

  client.on("deregistered", () => {
    console.log("deregistering");
    process.exit();
  });

  client.on("started", () => {
    console.log("eureka host  " + eurekaHost);
  });

  process.on("SIGINT", exitHandler.bind(null, { exit: true }));
};
