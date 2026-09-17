package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznp {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.measurement.zznp zzb = null;
    private final com.google.android.gms.internal.measurement.zznt zzc;
    private final java.util.concurrent.ConcurrentMap zzd;

    static {
            com.google.android.gms.internal.measurement.zznp r0 = new com.google.android.gms.internal.measurement.zznp
            r0.<init>()
            com.google.android.gms.internal.measurement.zznp.zzb = r0
            return
    }

    private zznp() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzd = r0
            com.google.android.gms.internal.measurement.zzmz r0 = new com.google.android.gms.internal.measurement.zzmz
            r0.<init>()
            r1.zzc = r0
            return
    }

    public static com.google.android.gms.internal.measurement.zznp zza() {
            com.google.android.gms.internal.measurement.zznp r0 = com.google.android.gms.internal.measurement.zznp.zzb
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzns zzb(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = "messageType"
            com.google.android.gms.internal.measurement.zzmk.zzc(r4, r0)
            java.util.concurrent.ConcurrentMap r1 = r3.zzd
            java.lang.Object r2 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzns r2 = (com.google.android.gms.internal.measurement.zzns) r2
            if (r2 != 0) goto L21
            com.google.android.gms.internal.measurement.zznt r2 = r3.zzc
            com.google.android.gms.internal.measurement.zzns r2 = r2.zza(r4)
            com.google.android.gms.internal.measurement.zzmk.zzc(r4, r0)
            java.lang.Object r4 = r1.putIfAbsent(r4, r2)
            com.google.android.gms.internal.measurement.zzns r4 = (com.google.android.gms.internal.measurement.zzns) r4
            if (r4 == 0) goto L21
            return r4
        L21:
            return r2
    }
}
