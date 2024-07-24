const express = require("express");

const app = express();
const PORT = 6197;
const eurekaHelper = require("./eureka-client");

app.listen(PORT, (error) => {
  if (!error)
    console.log(
      "Server is Successfully Running,  and App is listening on port " + PORT
    );
  else console.log("Error occurred, server can't start", error);
});

app.get("/test", (req, res) => {
  res.json("I am user-service");
});

eurekaHelper.registerWithEureka("payment-gateway-service", PORT);
