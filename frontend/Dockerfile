
FROM node:alpine

WORKDIR /var/www/ecommerce.sanchitverma.com

COPY . /var/www/ecommerce.sanchitverma.com

 RUN npm install -g @angular/cli

 RUN npm install

CMD ["ng", "serve", "--host", "0.0.0.0"]
# CMD ["npm", "run", "ng", "serve"]
