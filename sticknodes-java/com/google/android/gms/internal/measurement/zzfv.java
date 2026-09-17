package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzfv extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfv zzb = null;
    private int zzd;
    private int zze;
    private java.lang.String zzf;
    private boolean zzg;
    private com.google.android.gms.internal.measurement.zzmj zzh;

    static {
            com.google.android.gms.internal.measurement.zzfv r0 = new com.google.android.gms.internal.measurement.zzfv
            r0.<init>()
            com.google.android.gms.internal.measurement.zzfv.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzfv> r1 = com.google.android.gms.internal.measurement.zzfv.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzfv() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzf = r0
            com.google.android.gms.internal.measurement.zzmj r0 = com.google.android.gms.internal.measurement.zzmd.zzcn()
            r1.zzh = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfv zzb() {
            com.google.android.gms.internal.measurement.zzfv r0 = com.google.android.gms.internal.measurement.zzfv.zzb
            return r0
    }

    public static com.google.android.gms.internal.measurement.zzfv zzc() {
            com.google.android.gms.internal.measurement.zzfv r0 = com.google.android.gms.internal.measurement.zzfv.zzb
            return r0
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzh
            int r0 = r0.size()
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.util.List zze() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmj r0 = r1.zzh
            return r0
    }

    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }

    public final boolean zzg() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean zzh() {
            r1 = this;
            int r0 = r1.zzd
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean zzi() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    public final int zzj() {
            r1 = this;
            int r0 = r1.zze
            int r0 = com.google.android.gms.internal.measurement.zzfu.zza(r0)
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            r7 = 1
            if (r6 == 0) goto L47
            r8 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r6 == r2) goto L22
            if (r6 == r1) goto L1c
            r7 = 0
            if (r6 == r0) goto L16
            if (r6 != r8) goto L15
            com.google.android.gms.internal.measurement.zzfv r6 = com.google.android.gms.internal.measurement.zzfv.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzfs r6 = new com.google.android.gms.internal.measurement.zzfs
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzfv r6 = new com.google.android.gms.internal.measurement.zzfv
            r6.<init>()
            return r6
        L22:
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            java.lang.String r4 = "zzd"
            r6[r3] = r4
            java.lang.String r3 = "zze"
            r6[r7] = r3
            com.google.android.gms.internal.measurement.zzmg r7 = com.google.android.gms.internal.measurement.zzft.zza
            r6[r2] = r7
            java.lang.String r7 = "zzf"
            r6[r1] = r7
            java.lang.String r7 = "zzg"
            r6[r0] = r7
            java.lang.String r7 = "zzh"
            r6[r8] = r7
            com.google.android.gms.internal.measurement.zzfv r7 = com.google.android.gms.internal.measurement.zzfv.zzb
            java.lang.String r8 = "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L47:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }
}
