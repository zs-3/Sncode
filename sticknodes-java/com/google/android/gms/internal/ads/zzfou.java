package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public enum zzfou extends java.lang.Enum {
    public static final com.google.android.gms.internal.ads.zzfou zza = null;
    public static final com.google.android.gms.internal.ads.zzfou zzb = null;
    public static final com.google.android.gms.internal.ads.zzfou zzc = null;
    private static final /* synthetic */ com.google.android.gms.internal.ads.zzfou[] zzd = null;
    private final java.lang.String zze;

    static {
            com.google.android.gms.internal.ads.zzfou r0 = new com.google.android.gms.internal.ads.zzfou
            java.lang.String r1 = "NATIVE"
            r2 = 0
            java.lang.String r3 = "native"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzfou.zza = r0
            com.google.android.gms.internal.ads.zzfou r1 = new com.google.android.gms.internal.ads.zzfou
            java.lang.String r3 = "JAVASCRIPT"
            r4 = 1
            java.lang.String r5 = "javascript"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.internal.ads.zzfou.zzb = r1
            com.google.android.gms.internal.ads.zzfou r3 = new com.google.android.gms.internal.ads.zzfou
            java.lang.String r5 = "NONE"
            r6 = 2
            java.lang.String r7 = "none"
            r3.<init>(r5, r6, r7)
            com.google.android.gms.internal.ads.zzfou.zzc = r3
            r5 = 3
            com.google.android.gms.internal.ads.zzfou[] r5 = new com.google.android.gms.internal.ads.zzfou[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.gms.internal.ads.zzfou.zzd = r5
            return
    }

    zzfou(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zze = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzfou[] values() {
            com.google.android.gms.internal.ads.zzfou[] r0 = com.google.android.gms.internal.ads.zzfou.zzd
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zzfou[] r0 = (com.google.android.gms.internal.ads.zzfou[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }
}
