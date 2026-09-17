package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzatl extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzatl zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgzs zzd;
    private com.google.android.gms.internal.ads.zzgzs zze;
    private com.google.android.gms.internal.ads.zzgzs zzf;
    private com.google.android.gms.internal.ads.zzgzs zzg;

    static {
            com.google.android.gms.internal.ads.zzatl r0 = new com.google.android.gms.internal.ads.zzatl
            r0.<init>()
            com.google.android.gms.internal.ads.zzatl.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzatl> r1 = com.google.android.gms.internal.ads.zzatl.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzatl() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            r1.zzd = r0
            r1.zze = r0
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzatk zza() {
            com.google.android.gms.internal.ads.zzatl r0 = com.google.android.gms.internal.ads.zzatl.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzatk r0 = (com.google.android.gms.internal.ads.zzatk) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzatl zzc() {
            com.google.android.gms.internal.ads.zzatl r0 = com.google.android.gms.internal.ads.zzatl.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzatl zzd(byte[] r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzatl r0 = com.google.android.gms.internal.ads.zzatl.zza
            com.google.android.gms.internal.ads.zzhbe r1 = com.google.android.gms.internal.ads.zzhbe.zzbx(r0, r1, r2)
            com.google.android.gms.internal.ads.zzatl r1 = (com.google.android.gms.internal.ads.zzatl) r1
            return r1
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzatl r1, com.google.android.gms.internal.ads.zzgzs r2) {
            int r0 = r1.zzc
            r0 = r0 | 1
            r1.zzc = r0
            r1.zzd = r2
            return
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzatl r1, com.google.android.gms.internal.ads.zzgzs r2) {
            int r0 = r1.zzc
            r0 = r0 | 2
            r1.zzc = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzatl r1, com.google.android.gms.internal.ads.zzgzs r2) {
            int r0 = r1.zzc
            r0 = r0 | 4
            r1.zzc = r0
            r1.zzf = r2
            return
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzatl r1, com.google.android.gms.internal.ads.zzgzs r2) {
            int r0 = r1.zzc
            r0 = r0 | 8
            r1.zzc = r0
            r1.zzg = r2
            return
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatl.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzatl> r3 = com.google.android.gms.internal.ads.zzatl.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatl.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatl r4 = com.google.android.gms.internal.ads.zzatl.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatl.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzatl r2 = com.google.android.gms.internal.ads.zzatl.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzatk r2 = new com.google.android.gms.internal.ads.zzatk
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzatl r2 = new com.google.android.gms.internal.ads.zzatl
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
            com.google.android.gms.internal.ads.zzatl r2 = com.google.android.gms.internal.ads.zzatl.zza
            java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L5c:
            return r3
        L5d:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgzs zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgzs zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgzs zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzg
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgzs zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzf
            return r0
    }
}
