package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class AdValue {
    private final int zza;
    private final java.lang.String zzb;
    private final long zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.ads.AdValue zza(int r1, java.lang.String r2, long r3) {
            com.google.android.gms.ads.AdValue r0 = new com.google.android.gms.ads.AdValue
            r0.<init>(r1, r2, r3)
            return r0
    }

    public java.lang.String getCurrencyCode() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public int getPrecisionType() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public long getValueMicros() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }
}
