package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public enum AdFormat extends java.lang.Enum<com.google.android.gms.ads.AdFormat> {
    public static final com.google.android.gms.ads.AdFormat APP_OPEN_AD = null;
    public static final com.google.android.gms.ads.AdFormat BANNER = null;
    public static final com.google.android.gms.ads.AdFormat INTERSTITIAL = null;
    public static final com.google.android.gms.ads.AdFormat NATIVE = null;
    public static final com.google.android.gms.ads.AdFormat REWARDED = null;
    public static final com.google.android.gms.ads.AdFormat REWARDED_INTERSTITIAL = null;
    private static final /* synthetic */ com.google.android.gms.ads.AdFormat[] zza = null;
    private final int zzb;

    static {
            com.google.android.gms.ads.AdFormat r0 = new com.google.android.gms.ads.AdFormat
            java.lang.String r1 = "BANNER"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.ads.AdFormat.BANNER = r0
            com.google.android.gms.ads.AdFormat r1 = new com.google.android.gms.ads.AdFormat
            java.lang.String r3 = "INTERSTITIAL"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.ads.AdFormat.INTERSTITIAL = r1
            com.google.android.gms.ads.AdFormat r3 = new com.google.android.gms.ads.AdFormat
            java.lang.String r5 = "REWARDED"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.ads.AdFormat.REWARDED = r3
            com.google.android.gms.ads.AdFormat r5 = new com.google.android.gms.ads.AdFormat
            java.lang.String r7 = "REWARDED_INTERSTITIAL"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL = r5
            com.google.android.gms.ads.AdFormat r7 = new com.google.android.gms.ads.AdFormat
            java.lang.String r9 = "NATIVE"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.ads.AdFormat.NATIVE = r7
            com.google.android.gms.ads.AdFormat r9 = new com.google.android.gms.ads.AdFormat
            java.lang.String r11 = "APP_OPEN_AD"
            r12 = 5
            r13 = 6
            r9.<init>(r11, r12, r13)
            com.google.android.gms.ads.AdFormat.APP_OPEN_AD = r9
            com.google.android.gms.ads.AdFormat[] r11 = new com.google.android.gms.ads.AdFormat[r13]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.ads.AdFormat.zza = r11
            return
    }

    AdFormat(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.ads.AdFormat getAdFormat(int r5) {
            com.google.android.gms.ads.AdFormat[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            int r4 = r3.getValue()
            if (r4 != r5) goto L11
            return r3
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            r5 = 0
            return r5
    }

    public static com.google.android.gms.ads.AdFormat valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.ads.AdFormat> r0 = com.google.android.gms.ads.AdFormat.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.ads.AdFormat r1 = (com.google.android.gms.ads.AdFormat) r1
            return r1
    }

    public static com.google.android.gms.ads.AdFormat[] values() {
            com.google.android.gms.ads.AdFormat[] r0 = com.google.android.gms.ads.AdFormat.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.ads.AdFormat[] r0 = (com.google.android.gms.ads.AdFormat[]) r0
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}
