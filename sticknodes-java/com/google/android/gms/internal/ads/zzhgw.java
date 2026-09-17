package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhgw extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzhgw zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private java.lang.String zzd;
    private long zze;
    private boolean zzf;
    private int zzg;
    private java.lang.String zzh;
    private java.lang.String zzi;
    private boolean zzj;
    private boolean zzk;

    static {
            com.google.android.gms.internal.ads.zzhgw r0 = new com.google.android.gms.internal.ads.zzhgw
            r0.<init>()
            com.google.android.gms.internal.ads.zzhgw.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhgw> r1 = com.google.android.gms.internal.ads.zzhgw.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzhgw() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzd = r0
            r1.zzh = r0
            r1.zzi = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzhgv zzc() {
            com.google.android.gms.internal.ads.zzhgw r0 = com.google.android.gms.internal.ads.zzhgw.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzhgv r0 = (com.google.android.gms.internal.ads.zzhgv) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhgw zzd() {
            com.google.android.gms.internal.ads.zzhgw r0 = com.google.android.gms.internal.ads.zzhgw.zza
            return r0
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhgw r1, java.lang.String r2) {
            int r0 = r1.zzc
            r0 = r0 | 1
            r1.zzc = r0
            r1.zzd = r2
            return
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhgw r1, long r2) {
            int r0 = r1.zzc
            r0 = r0 | 2
            r1.zzc = r0
            r1.zze = r2
            return
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhgw r1, boolean r2) {
            int r0 = r1.zzc
            r0 = r0 | 4
            r1.zzc = r0
            r1.zzf = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L79;
                case 1: goto L78;
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzhgw.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzhgw> r3 = com.google.android.gms.internal.ads.zzhgw.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzhgw.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhgw r4 = com.google.android.gms.internal.ads.zzhgw.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhgw.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzhgw r2 = com.google.android.gms.internal.ads.zzhgw.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzhgv r2 = new com.google.android.gms.internal.ads.zzhgv
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzhgw r2 = new com.google.android.gms.internal.ads.zzhgw
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 10
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
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzhgx.zza
            r3[r2] = r4
            r2 = 6
            java.lang.String r4 = "zzh"
            r3[r2] = r4
            r2 = 7
            java.lang.String r4 = "zzi"
            r3[r2] = r4
            r2 = 8
            java.lang.String r4 = "zzj"
            r3[r2] = r4
            r2 = 9
            java.lang.String r4 = "zzk"
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzhgw r2 = com.google.android.gms.internal.ads.zzhgw.zza
            java.lang.String r4 = "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L78:
            return r3
        L79:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
