import { registerPlugin } from '@capacitor/core';

import type { AdyenT2PPluginPlugin } from './definitions';

const AdyenT2PPlugin = registerPlugin<AdyenT2PPluginPlugin>('AdyenT2PPlugin', {
  web: () => import('./web').then(m => new m.AdyenT2PPluginWeb()),
});

export * from './definitions';
export { AdyenT2PPlugin };
