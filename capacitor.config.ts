import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'com.cypx.holdings',
  appName: 'CYPX HOLDINGS',
  webDir: 'www',
  server: {
    url: 'https://quantamwallet.github.io/CYPX-ONLINE-CRYPTO-/',
    cleartext: false
  }
};

export default config;
