package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzatg extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzatg zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    static {
            com.google.android.gms.internal.ads.zzatg r0 = new com.google.android.gms.internal.ads.zzatg
            r0.<init>()
            com.google.android.gms.internal.ads.zzatg.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzatg> r1 = com.google.android.gms.internal.ads.zzatg.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzatg() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r0
            r2.zzi = r0
            r2.zzj = r0
            r2.zzk = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzatf zza() {
            com.google.android.gms.internal.ads.zzatg r0 = com.google.android.gms.internal.ads.zzatg.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzatf r0 = (com.google.android.gms.internal.ads.zzatf) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzatg zzc() {
            com.google.android.gms.internal.ads.zzatg r0 = com.google.android.gms.internal.ads.zzatg.zza
            return r0
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzatg r1, long r2) {
            int r0 = r1.zzc
            r0 = r0 | 1
            r1.zzc = r0
            r1.zzd = r2
            return
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzatg r1, long r2) {
            int r0 = r1.zzc
            r0 = r0 | 4
            r1.zzc = r0
            r1.zzf = r2
            return
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzatg r1, long r2) {
            int r0 = r1.zzc
            r0 = r0 | 8
            r1.zzc = r0
            r1.zzg = r2
            return
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzatg r1, long r2) {
            int r0 = r1.zzc
            r0 = r0 | 16
            r1.zzc = r0
            r1.zzh = r2
            return
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzatg r1, long r2) {
            int r0 = r1.zzc
            r0 = r0 | 32
            r1.zzc = r0
            r1.zzi = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L73;
                case 1: goto L72;
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatg.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzatg> r3 = com.google.android.gms.internal.ads.zzatg.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzatg.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatg r4 = com.google.android.gms.internal.ads.zzatg.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzatg.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzatg r2 = com.google.android.gms.internal.ads.zzatg.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzatf r2 = new com.google.android.gms.internal.ads.zzatf
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzatg r2 = new com.google.android.gms.internal.ads.zzatg
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 9
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
            r2 = 6
            java.lang.String r4 = "zzi"
            r3[r2] = r4
            r2 = 7
            java.lang.String r4 = "zzj"
            r3[r2] = r4
            r2 = 8
            java.lang.String r4 = "zzk"
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzatg r2 = com.google.android.gms.internal.ads.zzatg.zza
            java.lang.String r4 = "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L72:
            return r3
        L73:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
