package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzatj extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzatj zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private com.google.android.gms.internal.ads.zzhbm zzg;
    private long zzh;

    static {
            com.google.android.gms.internal.ads.zzatj r0 = new com.google.android.gms.internal.ads.zzatj
            r0.<init>()
            com.google.android.gms.internal.ads.zzatj.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzatj> r1 = com.google.android.gms.internal.ads.zzatj.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzatj() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzhbm r0 = com.google.android.gms.internal.ads.zzhbe.zzbG()
            r1.zzg = r0
            return
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzatj zza() {
            com.google.android.gms.internal.ads.zzatj r0 = com.google.android.gms.internal.ads.zzatj.zza
            return r0
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatj.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzatj> r3 = com.google.android.gms.internal.ads.zzatj.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatj.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatj r4 = com.google.android.gms.internal.ads.zzatj.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatj.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzatj r2 = com.google.android.gms.internal.ads.zzatj.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzati r2 = new com.google.android.gms.internal.ads.zzati
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzatj r2 = new com.google.android.gms.internal.ads.zzatj
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
            java.lang.String r4 = "zze"
            r3[r2] = r4
            r2 = 3
            java.lang.String r4 = "zzf"
            r3[r2] = r4
            r2 = 4
            java.lang.String r4 = "zzg"
            r3[r2] = r4
            r2 = 5
            java.lang.String r4 = "zzh"
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzatj r2 = com.google.android.gms.internal.ads.zzatj.zza
            java.lang.String r4 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L61:
            return r3
        L62:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
