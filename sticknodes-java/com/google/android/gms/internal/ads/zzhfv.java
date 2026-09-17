package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhfv extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzhfv zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzhfu zzd;
    private com.google.android.gms.internal.ads.zzhbq zze;
    private com.google.android.gms.internal.ads.zzgzs zzf;
    private com.google.android.gms.internal.ads.zzgzs zzg;
    private int zzh;
    private byte zzi;

    static {
            com.google.android.gms.internal.ads.zzhfv r0 = new com.google.android.gms.internal.ads.zzhfv
            r0.<init>()
            com.google.android.gms.internal.ads.zzhfv.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhfv> r1 = com.google.android.gms.internal.ads.zzhfv.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzhfv() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zzi = r0
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbK()
            r1.zze = r0
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzhfs zzc() {
            com.google.android.gms.internal.ads.zzhfv r0 = com.google.android.gms.internal.ads.zzhfv.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzhfs r0 = (com.google.android.gms.internal.ads.zzhfs) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhfv zzd() {
            com.google.android.gms.internal.ads.zzhfv r0 = com.google.android.gms.internal.ads.zzhfv.zza
            return r0
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhfv r2, com.google.android.gms.internal.ads.zzhfr r3) {
            r3.getClass()
            com.google.android.gms.internal.ads.zzhbq r0 = r2.zze
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L11
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbL(r0)
            r2.zze = r0
        L11:
            com.google.android.gms.internal.ads.zzhbq r2 = r2.zze
            r2.add(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3.ordinal()
            r5 = 0
            r0 = 1
            r1 = 0
            switch(r3) {
                case 0: goto L6c;
                case 1: goto L66;
                case 2: goto L39;
                case 3: goto L33;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L10;
                default: goto La;
            }
        La:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L10:
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhfv.zzb
            if (r3 != 0) goto L29
            java.lang.Class<com.google.android.gms.internal.ads.zzhfv> r4 = com.google.android.gms.internal.ads.zzhfv.class
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhfv.zzb     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L24
            com.google.android.gms.internal.ads.zzhaz r3 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzhfv r5 = com.google.android.gms.internal.ads.zzhfv.zza     // Catch: java.lang.Throwable -> L26
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzhfv.zzb = r3     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            throw r3
        L29:
            return r3
        L2a:
            com.google.android.gms.internal.ads.zzhfv r3 = com.google.android.gms.internal.ads.zzhfv.zza
            return r3
        L2d:
            com.google.android.gms.internal.ads.zzhfs r3 = new com.google.android.gms.internal.ads.zzhfs
            r3.<init>(r5)
            return r3
        L33:
            com.google.android.gms.internal.ads.zzhfv r3 = new com.google.android.gms.internal.ads.zzhfv
            r3.<init>()
            return r3
        L39:
            java.lang.String r3 = "zzc"
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "zzd"
            r4[r0] = r3
            r3 = 2
            java.lang.String r5 = "zze"
            r4[r3] = r5
            r3 = 3
            java.lang.Class<com.google.android.gms.internal.ads.zzhfr> r5 = com.google.android.gms.internal.ads.zzhfr.class
            r4[r3] = r5
            r3 = 4
            java.lang.String r5 = "zzf"
            r4[r3] = r5
            r3 = 5
            java.lang.String r5 = "zzg"
            r4[r3] = r5
            r3 = 6
            java.lang.String r5 = "zzh"
            r4[r3] = r5
            com.google.android.gms.internal.ads.zzhfv r3 = com.google.android.gms.internal.ads.zzhfv.zza
            java.lang.String r5 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003"
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzhbe.zzbS(r3, r5, r4)
            return r3
        L66:
            if (r4 != 0) goto L69
            r0 = 0
        L69:
            r2.zzi = r0
            return r5
        L6c:
            byte r3 = r2.zzi
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
    }
}
