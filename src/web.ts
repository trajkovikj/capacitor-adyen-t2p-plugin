import { WebPlugin } from '@capacitor/core';

import type { AdyenT2PPluginPlugin } from './definitions';

export class AdyenT2PPluginWeb extends WebPlugin implements AdyenT2PPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
