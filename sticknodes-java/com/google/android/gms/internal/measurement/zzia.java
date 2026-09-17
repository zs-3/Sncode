package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzia extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzia zzb = null;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzmj zzf;

    static {
            com.google.android.gms.internal.measurement.zzia r0 = new com.google.android.gms.internal.measurement.zzia
            r0.<init>()
            com.google.android.gms.internal.measurement.zzia.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzia> r1 = com.google.android.gms.internal.measurement.zzia.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzia() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zze = r0
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzf = r0
            return
    }

    public static com.google.android.gms.internal.measurement.zzhy zza() {
            com.google.android.gms.internal.measurement.zzia r0 = com.google.android.gms.internal.measurement.zzia.zzb
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzcg()
            com.google.android.gms.internal.measurement.zzhy r0 = (com.google.android.gms.internal.measurement.zzhy) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzia zzb() {
            com.google.android.gms.internal.measurement.zzia r0 = com.google.android.gms.internal.measurement.zzia.zzb
            return r0
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.measurement.zzia r2, com.google.android.gms.internal.measurement.zzho r3) {
            r3.getClass()
            com.google.android.gms.internal.measurement.zzmj r0 = r2.zzf
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L11
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzco(r0)
            r2.zzf = r0
        L11:
            com.google.android.gms.internal.measurement.zzmj r2 = r2.zzf
            r2.add(r3)
            return
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
            com.google.android.gms.internal.measurement.zzia r5 = com.google.android.gms.internal.measurement.zzia.zzb
            return r5
        L15:
            throw r6
        L16:
            com.google.android.gms.internal.measurement.zzhy r5 = new com.google.android.gms.internal.measurement.zzhy
            r5.<init>(r6)
            return r5
        L1c:
            com.google.android.gms.internal.measurement.zzia r5 = new com.google.android.gms.internal.measurement.zzia
            r5.<init>()
            return r5
        L22:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            java.lang.String r3 = "zzd"
            r5[r7] = r3
            java.lang.String r7 = "zze"
            r5[r6] = r7
            com.google.android.gms.internal.measurement.zzmg r6 = com.google.android.gms.internal.measurement.zzhz.zza
            r5[r2] = r6
            java.lang.String r6 = "zzf"
            r5[r1] = r6
            java.lang.Class<com.google.android.gms.internal.measurement.zzho> r6 = com.google.android.gms.internal.measurement.zzho.class
            r5[r0] = r6
            com.google.android.gms.internal.measurement.zzia r6 = com.google.android.gms.internal.measurement.zzia.zzb
            java.lang.String r7 = "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzmd.zzcq(r6, r7, r5)
            return r5
        L42:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r6)
            return r5
    }
}
