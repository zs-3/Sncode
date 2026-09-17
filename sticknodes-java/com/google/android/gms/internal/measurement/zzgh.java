package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgh extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgh zzb = null;
    private int zzd;
    private java.lang.String zze;
    private java.lang.String zzf;

    static {
            com.google.android.gms.internal.measurement.zzgh r0 = new com.google.android.gms.internal.measurement.zzgh
            r0.<init>()
            com.google.android.gms.internal.measurement.zzgh.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzgh> r1 = com.google.android.gms.internal.measurement.zzgh.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzgh() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            r1.zzf = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgh zza() {
            com.google.android.gms.internal.measurement.zzgh r0 = com.google.android.gms.internal.measurement.zzgh.zzb
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3 + (-1)
            r4 = 1
            if (r3 == 0) goto L3a
            r5 = 3
            r0 = 2
            if (r3 == r0) goto L22
            if (r3 == r5) goto L1c
            r4 = 4
            r5 = 0
            if (r3 == r4) goto L16
            r4 = 5
            if (r3 != r4) goto L15
            com.google.android.gms.internal.measurement.zzgh r3 = com.google.android.gms.internal.measurement.zzgh.zzb
            return r3
        L15:
            throw r5
        L16:
            com.google.android.gms.internal.measurement.zzgg r3 = new com.google.android.gms.internal.measurement.zzgg
            r3.<init>(r5)
            return r3
        L1c:
            com.google.android.gms.internal.measurement.zzgh r3 = new com.google.android.gms.internal.measurement.zzgh
            r3.<init>()
            return r3
        L22:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r5 = 0
            java.lang.String r1 = "zzd"
            r3[r5] = r1
            java.lang.String r5 = "zze"
            r3[r4] = r5
            java.lang.String r4 = "zzf"
            r3[r0] = r4
            com.google.android.gms.internal.measurement.zzgh r4 = com.google.android.gms.internal.measurement.zzgh.zzb
            java.lang.String r5 = "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmd.zzcq(r4, r5, r3)
            return r3
        L3a:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }
}
