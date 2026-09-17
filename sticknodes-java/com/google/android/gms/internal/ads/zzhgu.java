package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhgu extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzhgu zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private int zzd;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzhfv zzf;
    private com.google.android.gms.internal.ads.zzhfz zzg;
    private int zzh;
    private com.google.android.gms.internal.ads.zzhbm zzi;
    private java.lang.String zzj;
    private int zzk;
    private com.google.android.gms.internal.ads.zzhbq zzl;
    private byte zzm;

    static {
            com.google.android.gms.internal.ads.zzhgu r0 = new com.google.android.gms.internal.ads.zzhgu
            r0.<init>()
            com.google.android.gms.internal.ads.zzhgu.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhgu> r1 = com.google.android.gms.internal.ads.zzhgu.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzhgu() {
            r2 = this;
            r2.<init>()
            r0 = 2
            r2.zzm = r0
            java.lang.String r0 = ""
            r2.zze = r0
            com.google.android.gms.internal.ads.zzhbm r1 = com.google.android.gms.internal.ads.zzhbe.zzbG()
            r2.zzi = r1
            r2.zzj = r0
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbK()
            r2.zzl = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzhgt zzd() {
            com.google.android.gms.internal.ads.zzhgu r0 = com.google.android.gms.internal.ads.zzhgu.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzhgt r0 = (com.google.android.gms.internal.ads.zzhgt) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhgu zze() {
            com.google.android.gms.internal.ads.zzhgu r0 = com.google.android.gms.internal.ads.zzhgu.zza
            return r0
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhgu r1, int r2) {
            int r0 = r1.zzc
            r0 = r0 | 1
            r1.zzc = r0
            r1.zzd = r2
            return
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzhgu r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzc
            r0 = r0 | 2
            r1.zzc = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhgu r0, com.google.android.gms.internal.ads.zzhfv r1) {
            r1.getClass()
            r0.zzf = r1
            int r1 = r0.zzc
            r1 = r1 | 4
            r0.zzc = r1
            return
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzhgu r2, java.lang.String r3) {
            r3.getClass()
            com.google.android.gms.internal.ads.zzhbq r0 = r2.zzl
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L11
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbL(r0)
            r2.zzl = r0
        L11:
            com.google.android.gms.internal.ads.zzhbq r2 = r2.zzl
            r2.add(r3)
            return
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzhgu r0, int r1) {
            int r1 = r1 + (-1)
            r0.zzk = r1
            int r1 = r0.zzc
            r1 = r1 | 64
            r0.zzc = r1
            return
    }

    public final int zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbq r0 = r1.zzl
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3.ordinal()
            r5 = 0
            r0 = 1
            r1 = 0
            switch(r3) {
                case 0: goto L84;
                case 1: goto L7e;
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
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhgu.zzb
            if (r3 != 0) goto L29
            java.lang.Class<com.google.android.gms.internal.ads.zzhgu> r4 = com.google.android.gms.internal.ads.zzhgu.class
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhgu.zzb     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L24
            com.google.android.gms.internal.ads.zzhaz r3 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzhgu r5 = com.google.android.gms.internal.ads.zzhgu.zza     // Catch: java.lang.Throwable -> L26
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzhgu.zzb = r3     // Catch: java.lang.Throwable -> L26
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
            com.google.android.gms.internal.ads.zzhgu r3 = com.google.android.gms.internal.ads.zzhgu.zza
            return r3
        L2d:
            com.google.android.gms.internal.ads.zzhgt r3 = new com.google.android.gms.internal.ads.zzhgt
            r3.<init>(r5)
            return r3
        L33:
            com.google.android.gms.internal.ads.zzhgu r3 = new com.google.android.gms.internal.ads.zzhgu
            r3.<init>()
            return r3
        L39:
            java.lang.String r3 = "zzc"
            r4 = 11
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "zzd"
            r4[r0] = r3
            r3 = 2
            java.lang.String r5 = "zze"
            r4[r3] = r5
            r3 = 3
            java.lang.String r5 = "zzf"
            r4[r3] = r5
            r3 = 4
            java.lang.String r5 = "zzg"
            r4[r3] = r5
            r3 = 5
            java.lang.String r5 = "zzh"
            r4[r3] = r5
            r3 = 6
            java.lang.String r5 = "zzi"
            r4[r3] = r5
            r3 = 7
            java.lang.String r5 = "zzj"
            r4[r3] = r5
            r3 = 8
            java.lang.String r5 = "zzk"
            r4[r3] = r5
            r3 = 9
            com.google.android.gms.internal.ads.zzhbk r5 = com.google.android.gms.internal.ads.zzhgr.zza
            r4[r3] = r5
            r3 = 10
            java.lang.String r5 = "zzl"
            r4[r3] = r5
            com.google.android.gms.internal.ads.zzhgu r3 = com.google.android.gms.internal.ads.zzhgu.zza
            java.lang.String r5 = "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a"
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzhbe.zzbS(r3, r5, r4)
            return r3
        L7e:
            if (r4 != 0) goto L81
            r0 = 0
        L81:
            r2.zzm = r0
            return r5
        L84:
            byte r3 = r2.zzm
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
    }

    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }
}
