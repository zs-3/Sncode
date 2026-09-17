package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgb extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgb zzb = null;
    private int zzd;
    private int zze;
    private int zzf;

    static {
            com.google.android.gms.internal.measurement.zzgb r0 = new com.google.android.gms.internal.measurement.zzgb
            r0.<init>()
            com.google.android.gms.internal.measurement.zzgb.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzgb> r1 = com.google.android.gms.internal.measurement.zzgb.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzgb() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgb zza() {
            com.google.android.gms.internal.measurement.zzgb r0 = com.google.android.gms.internal.measurement.zzgb.zzb
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzf
            int r0 = com.google.android.gms.internal.measurement.zzgf.zza(r0)
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zze
            int r0 = com.google.android.gms.internal.measurement.zzgf.zza(r0)
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r5 = r5 + (-1)
            r6 = 1
            if (r5 == 0) goto L40
            r7 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r5 == r2) goto L22
            if (r5 == r1) goto L1c
            r6 = 0
            if (r5 == r0) goto L16
            if (r5 != r7) goto L15
            com.google.android.gms.internal.measurement.zzgb r5 = com.google.android.gms.internal.measurement.zzgb.zzb
            return r5
        L15:
            throw r6
        L16:
            com.google.android.gms.internal.measurement.zzga r5 = new com.google.android.gms.internal.measurement.zzga
            r5.<init>(r6)
            return r5
        L1c:
            com.google.android.gms.internal.measurement.zzgb r5 = new com.google.android.gms.internal.measurement.zzgb
            r5.<init>()
            return r5
        L22:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            java.lang.String r3 = "zzd"
            r5[r7] = r3
            java.lang.String r7 = "zze"
            r5[r6] = r7
            com.google.android.gms.internal.measurement.zzmg r6 = com.google.android.gms.internal.measurement.zzge.zza
            r5[r2] = r6
            java.lang.String r7 = "zzf"
            r5[r1] = r7
            r5[r0] = r6
            com.google.android.gms.internal.measurement.zzgb r6 = com.google.android.gms.internal.measurement.zzgb.zzb
            java.lang.String r7 = "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzmd.zzcq(r6, r7, r5)
            return r5
        L40:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r6)
            return r5
    }
}
