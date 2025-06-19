import { createProxyMiddleware } from 'http-proxy-middleware';

module.exports = function(app) {
  app.use(
    '/cars/GetCars',
    createProxyMiddleware({
      target: 'http://172.18.0.4:8080',
      changeOrigin: true,
    })
  );
};