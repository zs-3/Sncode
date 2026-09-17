package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzir extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzir zzb = null;
    private com.google.android.gms.internal.measurement.zzmj zzd;

    static {
            com.google.android.gms.internal.measurement.zzir r0 = new com.google.android.gms.internal.measurement.zzir
            r0.<init>()
            com.google.android.gms.internal.measurement.zzir.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzir> r1 = com.google.android.gms.internal.measurement.zzir.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzir() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzd = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzir zzb() {
            com.google.android.gms.internal.measurement.zzir r0 = com.google.android.gms.internal.measurement.zzir.zzb
            return r0
    }

    public static com.google.android.gms.internal.measurement.zzir zzc() {
            com.google.android.gms.internal.measurement.zzir r0 = com.google.android.gms.internal.measurement.zzir.zzb
            return r0
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzd
            int r0 = r0.size()
            return r0
    }

    public final java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2 + (-1)
            r3 = 1
            if (r2 == 0) goto L36
            r4 = 2
            if (r2 == r4) goto L22
            r3 = 3
            if (r2 == r3) goto L1c
            r3 = 4
            r4 = 0
            if (r2 == r3) goto L16
            r3 = 5
            if (r2 != r3) goto L15
            com.google.android.gms.internal.measurement.zzir r2 = com.google.android.gms.internal.measurement.zzir.zzb
            return r2
        L15:
            throw r4
        L16:
            com.google.android.gms.internal.measurement.zziq r2 = new com.google.android.gms.internal.measurement.zziq
            r2.<init>(r4)
            return r2
        L1c:
            com.google.android.gms.internal.measurement.zzir r2 = new com.google.android.gms.internal.measurement.zzir
            r2.<init>()
            return r2
        L22:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            java.lang.String r0 = "zzd"
            r2[r4] = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzit> r4 = com.google.android.gms.internal.measurement.zzit.class
            r2[r3] = r4
            com.google.android.gms.internal.measurement.zzir r3 = com.google.android.gms.internal.measurement.zzir.zzb
            java.lang.String r4 = "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzmd.zzcq(r3, r4, r2)
            return r2
        L36:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }
}
