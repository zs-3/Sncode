package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhfr extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzhfr zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgzs zzd;
    private com.google.android.gms.internal.ads.zzgzs zze;
    private byte zzf;

    static {
            com.google.android.gms.internal.ads.zzhfr r0 = new com.google.android.gms.internal.ads.zzhfr
            r0.<init>()
            com.google.android.gms.internal.ads.zzhfr.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhfr> r1 = com.google.android.gms.internal.ads.zzhfr.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzhfr() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zzf = r0
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            r1.zzd = r0
            r1.zze = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzhfq zzc() {
            com.google.android.gms.internal.ads.zzhfr r0 = com.google.android.gms.internal.ads.zzhfr.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzhfq r0 = (com.google.android.gms.internal.ads.zzhfq) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhfr zzd() {
            com.google.android.gms.internal.ads.zzhfr r0 = com.google.android.gms.internal.ads.zzhfr.zza
            return r0
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhfr r1, com.google.android.gms.internal.ads.zzgzs r2) {
            int r0 = r1.zzc
            r0 = r0 | 1
            r1.zzc = r0
            r1.zzd = r2
            return
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhfr r1, com.google.android.gms.internal.ads.zzgzs r2) {
            int r0 = r1.zzc
            r0 = r0 | 2
            r1.zzc = r0
            r1.zze = r2
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
                case 0: goto L58;
                case 1: goto L52;
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
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhfr.zzb
            if (r3 != 0) goto L29
            java.lang.Class<com.google.android.gms.internal.ads.zzhfr> r4 = com.google.android.gms.internal.ads.zzhfr.class
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzhcx r3 = com.google.android.gms.internal.ads.zzhfr.zzb     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L24
            com.google.android.gms.internal.ads.zzhaz r3 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzhfr r5 = com.google.android.gms.internal.ads.zzhfr.zza     // Catch: java.lang.Throwable -> L26
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzhfr.zzb = r3     // Catch: java.lang.Throwable -> L26
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
            com.google.android.gms.internal.ads.zzhfr r3 = com.google.android.gms.internal.ads.zzhfr.zza
            return r3
        L2d:
            com.google.android.gms.internal.ads.zzhfq r3 = new com.google.android.gms.internal.ads.zzhfq
            r3.<init>(r5)
            return r3
        L33:
            com.google.android.gms.internal.ads.zzhfr r3 = new com.google.android.gms.internal.ads.zzhfr
            r3.<init>()
            return r3
        L39:
            java.lang.String r3 = "zzc"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "zzd"
            r4[r0] = r3
            r3 = 2
            java.lang.String r5 = "zze"
            r4[r3] = r5
            com.google.android.gms.internal.ads.zzhfr r3 = com.google.android.gms.internal.ads.zzhfr.zza
            java.lang.String r5 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001"
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzhbe.zzbS(r3, r5, r4)
            return r3
        L52:
            if (r4 != 0) goto L55
            r0 = 0
        L55:
            r2.zzf = r0
            return r5
        L58:
            byte r3 = r2.zzf
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
    }
}
