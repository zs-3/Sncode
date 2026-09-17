package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgy extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgy zzb = null;
    private int zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private java.lang.String zzg;
    private int zzh;
    private java.lang.String zzi;

    static {
            com.google.android.gms.internal.measurement.zzgy r0 = new com.google.android.gms.internal.measurement.zzgy
            r0.<init>()
            com.google.android.gms.internal.measurement.zzgy.zzb = r0
            java.lang.Class<com.google.android.gms.internal.measurement.zzgy> r1 = com.google.android.gms.internal.measurement.zzgy.class
            com.google.android.gms.internal.measurement.zzmd.zzct(r1, r0)
            return
    }

    private zzgy() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            r1.zzf = r0
            r1.zzg = r0
            r1.zzi = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgy zzb() {
            com.google.android.gms.internal.measurement.zzgy r0 = com.google.android.gms.internal.measurement.zzgy.zzb
            return r0
    }

    public static com.google.android.gms.internal.measurement.zzgy zzc() {
            com.google.android.gms.internal.measurement.zzgy r0 = com.google.android.gms.internal.measurement.zzgy.zzb
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zze
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
            com.google.android.gms.internal.measurement.zzgy r6 = com.google.android.gms.internal.measurement.zzgy.zzb
            return r6
        L15:
            throw r7
        L16:
            com.google.android.gms.internal.measurement.zzgx r6 = new com.google.android.gms.internal.measurement.zzgx
            r6.<init>(r7)
            return r6
        L1c:
            com.google.android.gms.internal.measurement.zzgy r6 = new com.google.android.gms.internal.measurement.zzgy
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
            java.lang.String r7 = "zzf"
            r6[r2] = r7
            java.lang.String r7 = "zzg"
            r6[r1] = r7
            java.lang.String r7 = "zzh"
            r6[r0] = r7
            java.lang.String r7 = "zzi"
            r6[r8] = r7
            com.google.android.gms.internal.measurement.zzgy r7 = com.google.android.gms.internal.measurement.zzgy.zzb
            java.lang.String r8 = "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzmd.zzcq(r7, r8, r6)
            return r6
        L47:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }
}
