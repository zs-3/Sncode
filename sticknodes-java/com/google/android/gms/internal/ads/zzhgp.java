package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhgp extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzhgp zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private int zzd;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzgzs zzf;
    private com.google.android.gms.internal.ads.zzgzs zzg;

    static {
            com.google.android.gms.internal.ads.zzhgp r0 = new com.google.android.gms.internal.ads.zzhgp
            r0.<init>()
            com.google.android.gms.internal.ads.zzhgp.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhgp> r1 = com.google.android.gms.internal.ads.zzhgp.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzhgp() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzhgn zzc() {
            com.google.android.gms.internal.ads.zzhgp r0 = com.google.android.gms.internal.ads.zzhgp.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzhgn r0 = (com.google.android.gms.internal.ads.zzhgn) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhgp zzd() {
            com.google.android.gms.internal.ads.zzhgp r0 = com.google.android.gms.internal.ads.zzhgp.zza
            return r0
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhgp r0, java.lang.String r1) {
            int r1 = r0.zzc
            r1 = r1 | 2
            r0.zzc = r1
            java.lang.String r1 = "image/png"
            r0.zze = r1
            return
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhgp r1, com.google.android.gms.internal.ads.zzgzs r2) {
            r2.getClass()
            int r0 = r1.zzc
            r0 = r0 | 4
            r1.zzc = r0
            r1.zzf = r2
            return
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhgp r1, int r2) {
            r2 = 1
            r1.zzd = r2
            int r0 = r1.zzc
            r2 = r2 | r0
            r1.zzc = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L62;
                case 1: goto L61;
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzhgp.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzhgp> r3 = com.google.android.gms.internal.ads.zzhgp.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzhgp.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhgp r4 = com.google.android.gms.internal.ads.zzhgp.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhgp.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzhgp r2 = com.google.android.gms.internal.ads.zzhgp.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzhgn r2 = new com.google.android.gms.internal.ads.zzhgn
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzhgp r2 = new com.google.android.gms.internal.ads.zzhgp
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "zzd"
            r3[r4] = r2
            r2 = 2
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzhgo.zza
            r3[r2] = r4
            r2 = 3
            java.lang.String r4 = "zze"
            r3[r2] = r4
            r2 = 4
            java.lang.String r4 = "zzf"
            r3[r2] = r4
            r2 = 5
            java.lang.String r4 = "zzg"
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzhgp r2 = com.google.android.gms.internal.ads.zzhgp.zza
            java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L61:
            return r3
        L62:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
