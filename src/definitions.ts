export interface AdyenT2PPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
