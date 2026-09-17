package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgs extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgs zzb = null;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
            com.google.android.gms.internal.measurement.zzgs r0 = new com.google.android.gms.internal.measurement.zzgs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzgs.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzgs> r1 = com.google.android.gms.internal.measurement.zzgs.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzgs() {
            r1 = this;
            r1.<init>()
            r0 = 14
            r1.zze = r0
            r0 = 11
            r1.zzf = r0
            r0 = 60
            r1.zzg = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgs zza() {
            com.google.android.gms.internal.measurement.zzgs r0 = com.google.android.gms.internal.measurement.zzgs.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r4 = r4 + (-1)
            r5 = 1
            if (r4 == 0) goto L3e
            r6 = 4
            r0 = 3
            r1 = 2
            if (r4 == r1) goto L22
            if (r4 == r0) goto L1c
            r5 = 0
            if (r4 == r6) goto L16
            r6 = 5
            if (r4 != r6) goto L15
            com.google.android.gms.internal.measurement.zzgs r4 = com.google.android.gms.internal.measurement.zzgs.zzb
            return r4
        L15:
            throw r5
        L16:
            com.google.android.gms.internal.measurement.zzgr r4 = new com.google.android.gms.internal.measurement.zzgr
            r4.<init>(r5)
            return r4
        L1c:
            com.google.android.gms.internal.measurement.zzgs r4 = new com.google.android.gms.internal.measurement.zzgs
            r4.<init>()
            return r4
        L22:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r6 = 0
            java.lang.String r2 = "zzd"
            r4[r6] = r2
            java.lang.String r6 = "zze"
            r4[r5] = r6
            java.lang.String r5 = "zzf"
            r4[r1] = r5
            java.lang.String r5 = "zzg"
            r4[r0] = r5
            com.google.android.gms.internal.measurement.zzgs r5 = com.google.android.gms.internal.measurement.zzgs.zzb
            java.lang.String r6 = "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmd.zzcq(r5, r6, r4)
            return r4
        L3e:
            java.lang.Byte r4 = java.lang.Byte.valueOf(r5)
            return r4
    }
}
