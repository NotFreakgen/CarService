import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import http from "https";

// https://vite.dev/config/
export default defineConfig({
  server: {
    proxy: {
      '/api' : {
        target: 'http://172.18.0.3:8080',
        changeOrigin: true,
        secure: false,
      }
    },
    host: '0.0.0.0',
  },
  plugins: [react()],
})
