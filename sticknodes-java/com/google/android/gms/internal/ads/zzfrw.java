package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfrw extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzfrw zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzhbm zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    static {
            com.google.android.gms.internal.ads.zzfrw r0 = new com.google.android.gms.internal.ads.zzfrw
            r0.<init>()
            com.google.android.gms.internal.ads.zzfrw.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzfrw> r1 = com.google.android.gms.internal.ads.zzfrw.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzfrw() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzhbm r0 = com.google.android.gms.internal.ads.zzhbe.zzbG()
            r1.zzd = r0
            java.lang.String r0 = ""
            r1.zze = r0
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzfrv zza() {
            com.google.android.gms.internal.ads.zzfrw r0 = com.google.android.gms.internal.ads.zzfrw.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzfrv r0 = (com.google.android.gms.internal.ads.zzfrv) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzfrw zzc() {
            com.google.android.gms.internal.ads.zzfrw r0 = com.google.android.gms.internal.ads.zzfrw.zza
            return r0
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfrw r1, java.lang.String r2) {
            r2.getClass()
            int r0 = r1.zzc
            r0 = r0 | 1
            r1.zzc = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzfrw r1, int r2) {
            com.google.android.gms.internal.ads.zzhbm r2 = r1.zzd
            boolean r0 = r2.zzc()
            if (r0 != 0) goto Le
            com.google.android.gms.internal.ads.zzhbm r2 = com.google.android.gms.internal.ads.zzhbe.zzbH(r2)
            r1.zzd = r2
        Le:
            com.google.android.gms.internal.ads.zzhbm r1 = r1.zzd
            r2 = 2
            r1.zzi(r2)
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzfrw.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzfrw> r3 = com.google.android.gms.internal.ads.zzfrw.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzfrw.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzfrw r4 = com.google.android.gms.internal.ads.zzfrw.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzfrw.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzfrw r2 = com.google.android.gms.internal.ads.zzfrw.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzfrv r2 = new com.google.android.gms.internal.ads.zzfrv
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzfrw r2 = new com.google.android.gms.internal.ads.zzfrw
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
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzfru.zza
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
            com.google.android.gms.internal.ads.zzfrw r2 = com.google.android.gms.internal.ads.zzfrw.zza
            java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L61:
            return r3
        L62:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
