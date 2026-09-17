package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgk extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgk zzb = null;
    private int zzd;
    private java.lang.String zze;
    private com.google.android.gms.internal.measurement.zzmj zzf;
    private boolean zzg;

    static {
            com.google.android.gms.internal.measurement.zzgk r0 = new com.google.android.gms.internal.measurement.zzgk
            r0.<init>()
            com.google.android.gms.internal.measurement.zzgk.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzgk> r1 = com.google.android.gms.internal.measurement.zzgk.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzgk() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzf = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgk zza() {
            com.google.android.gms.internal.measurement.zzgk r0 = com.google.android.gms.internal.measurement.zzgk.zzb
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r5 = r5 + (-1)
            r6 = 1
            if (r5 == 0) goto L42
            r7 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r5 == r2) goto L22
            if (r5 == r1) goto L1c
            r6 = 0
            if (r5 == r0) goto L16
            if (r5 != r7) goto L15
            com.google.android.gms.internal.measurement.zzgk r5 = com.google.android.gms.internal.measurement.zzgk.zzb
            return r5
        L15:
            throw r6
        L16:
            com.google.android.gms.internal.measurement.zzgj r5 = new com.google.android.gms.internal.measurement.zzgj
            r5.<init>(r6)
            return r5
        L1c:
            com.google.android.gms.internal.measurement.zzgk r5 = new com.google.android.gms.internal.measurement.zzgk
            r5.<init>()
            return r5
        L22:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            java.lang.String r3 = "zzd"
            r5[r7] = r3
            java.lang.String r7 = "zze"
            r5[r6] = r7
            java.lang.String r6 = "zzf"
            r5[r2] = r6
            java.lang.Class<com.google.android.gms.internal.measurement.zzgu> r6 = com.google.android.gms.internal.measurement.zzgu.class
            r5[r1] = r6
            java.lang.String r6 = "zzg"
            r5[r0] = r6
            com.google.android.gms.internal.measurement.zzgk r6 = com.google.android.gms.internal.measurement.zzgk.zzb
            java.lang.String r7 = "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzmd.zzcq(r6, r7, r5)
            return r5
        L42:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r6)
            return r5
    }
}
