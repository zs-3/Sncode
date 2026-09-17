package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgwm extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzgwm zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgwb zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
            com.google.android.gms.internal.ads.zzgwm r0 = new com.google.android.gms.internal.ads.zzgwm
            r0.<init>()
            com.google.android.gms.internal.ads.zzgwm.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzgwm> r1 = com.google.android.gms.internal.ads.zzgwm.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzgwm() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzgwl zzd() {
            com.google.android.gms.internal.ads.zzgwm r0 = com.google.android.gms.internal.ads.zzgwm.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzgwl r0 = (com.google.android.gms.internal.ads.zzgwl) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzgwm zze() {
            com.google.android.gms.internal.ads.zzgwm r0 = com.google.android.gms.internal.ads.zzgwm.zza
            return r0
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzgwm r0, com.google.android.gms.internal.ads.zzgwb r1) {
            r1.getClass()
            r0.zzd = r1
            int r1 = r0.zzc
            r1 = r1 | 1
            r0.zzc = r1
            return
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzgwm r0, com.google.android.gms.internal.ads.zzgxf r1) {
            int r1 = r1.zza()
            r0.zzg = r1
            return
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzgwm r0, int r1) {
            r0.zzf = r1
            return
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzgwm r0, int r1) {
            int r1 = com.google.android.gms.internal.ads.zzgwc.zza(r1)
            r0.zze = r1
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgwb zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgwb r0 = r1.zzd
            if (r0 != 0) goto L8
            com.google.android.gms.internal.ads.zzgwb r0 = com.google.android.gms.internal.ads.zzgwb.zze()
        L8:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L5d;
                case 1: goto L5c;
                case 2: goto L38;
                case 3: goto L32;
                case 4: goto L2c;
                case 5: goto L29;
                case 6: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Lf:
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgwm.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzgwm> r3 = com.google.android.gms.internal.ads.zzgwm.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgwm.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgwm r4 = com.google.android.gms.internal.ads.zzgwm.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgwm.zzb = r2     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r2
        L28:
            return r2
        L29:
            com.google.android.gms.internal.ads.zzgwm r2 = com.google.android.gms.internal.ads.zzgwm.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzgwl r2 = new com.google.android.gms.internal.ads.zzgwl
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzgwm r2 = new com.google.android.gms.internal.ads.zzgwm
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "zzd"
            r3[r4] = r2
            r2 = 2
            java.lang.String r4 = "zze"
            r3[r2] = r4
            r2 = 3
            java.lang.String r4 = "zzf"
            r3[r2] = r4
            r2 = 4
            java.lang.String r4 = "zzg"
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzgwm r2 = com.google.android.gms.internal.ads.zzgwm.zza
            java.lang.String r4 = "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L5c:
            return r3
        L5d:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgxf zzf() {
            r1 = this;
            int r0 = r1.zzg
            com.google.android.gms.internal.ads.zzgxf r0 = com.google.android.gms.internal.ads.zzgxf.zzb(r0)
            if (r0 != 0) goto La
            com.google.android.gms.internal.ads.zzgxf r0 = com.google.android.gms.internal.ads.zzgxf.zzf
        La:
            return r0
    }

    public final boolean zzj() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    public final int zzk() {
            r4 = this;
            int r0 = r4.zze
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L13
            if (r0 == r3) goto L14
            if (r0 == r2) goto L11
            if (r0 == r1) goto Lf
            r1 = 0
            goto L14
        Lf:
            r1 = 5
            goto L14
        L11:
            r1 = 4
            goto L14
        L13:
            r1 = 2
        L14:
            if (r1 != 0) goto L17
            return r3
        L17:
            return r1
    }
}
