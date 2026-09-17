package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgq extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgq zzb = null;
    private com.google.android.gms.internal.measurement.zzmj zzd;

    static {
            com.google.android.gms.internal.measurement.zzgq r0 = new com.google.android.gms.internal.measurement.zzgq
            r0.<init>()
            com.google.android.gms.internal.measurement.zzgq.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzgq> r1 = com.google.android.gms.internal.measurement.zzgq.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzgq() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzd = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgq zza() {
            com.google.android.gms.internal.measurement.zzgq r0 = com.google.android.gms.internal.measurement.zzgq.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int r1 = r1 + (-1)
            r2 = 1
            if (r1 == 0) goto L32
            r3 = 2
            if (r1 == r3) goto L22
            r2 = 3
            if (r1 == r2) goto L1c
            r2 = 4
            r3 = 0
            if (r1 == r2) goto L16
            r2 = 5
            if (r1 != r2) goto L15
            com.google.android.gms.internal.measurement.zzgq r1 = com.google.android.gms.internal.measurement.zzgq.zzb
            return r1
        L15:
            throw r3
        L16:
            com.google.android.gms.internal.measurement.zzgp r1 = new com.google.android.gms.internal.measurement.zzgp
            r1.<init>(r3)
            return r1
        L1c:
            com.google.android.gms.internal.measurement.zzgq r1 = new com.google.android.gms.internal.measurement.zzgq
            r1.<init>()
            return r1
        L22:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            java.lang.String r3 = "zzd"
            r1[r2] = r3
            com.google.android.gms.internal.measurement.zzgq r2 = com.google.android.gms.internal.measurement.zzgq.zzb
            java.lang.String r3 = "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzmd.zzcq(r2, r3, r1)
            return r1
        L32:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            return r1
    }
}
