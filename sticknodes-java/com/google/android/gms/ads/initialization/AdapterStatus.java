package com.google.android.gms.ads.initialization;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public enum State extends java.lang.Enum<com.google.android.gms.ads.initialization.AdapterStatus.State> {
        public static final com.google.android.gms.ads.initialization.AdapterStatus.State NOT_READY = null;
        public static final com.google.android.gms.ads.initialization.AdapterStatus.State READY = null;
        private static final /* synthetic */ com.google.android.gms.ads.initialization.AdapterStatus.State[] zza = null;

        static {
                com.google.android.gms.ads.initialization.AdapterStatus$State r0 = new com.google.android.gms.ads.initialization.AdapterStatus$State
                java.lang.String r1 = "NOT_READY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.gms.ads.initialization.AdapterStatus.State.NOT_READY = r0
                com.google.android.gms.ads.initialization.AdapterStatus$State r1 = new com.google.android.gms.ads.initialization.AdapterStatus$State
                java.lang.String r3 = "READY"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.gms.ads.initialization.AdapterStatus.State.READY = r1
                r3 = 2
                com.google.android.gms.ads.initialization.AdapterStatus$State[] r3 = new com.google.android.gms.ads.initialization.AdapterStatus.State[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.android.gms.ads.initialization.AdapterStatus.State.zza = r3
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.gms.ads.initialization.AdapterStatus.State valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.gms.ads.initialization.AdapterStatus$State> r0 = com.google.android.gms.ads.initialization.AdapterStatus.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.gms.ads.initialization.AdapterStatus$State r1 = (com.google.android.gms.ads.initialization.AdapterStatus.State) r1
                return r1
        }

        public static com.google.android.gms.ads.initialization.AdapterStatus.State[] values() {
                com.google.android.gms.ads.initialization.AdapterStatus$State[] r0 = com.google.android.gms.ads.initialization.AdapterStatus.State.zza
                java.lang.Object r0 = r0.clone()
                com.google.android.gms.ads.initialization.AdapterStatus$State[] r0 = (com.google.android.gms.ads.initialization.AdapterStatus.State[]) r0
                return r0
        }
    }

    java.lang.String getDescription();

    com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState();

    int getLatency();
}
