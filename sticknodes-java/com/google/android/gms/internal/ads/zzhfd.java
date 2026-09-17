package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhfd extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzhfd zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private java.lang.String zzf;
    private com.google.android.gms.internal.ads.zzhbq zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private java.lang.String zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private com.google.android.gms.internal.ads.zzhbq zzu;
    private boolean zzv;
    private long zzw;
    private com.google.android.gms.internal.ads.zzhbm zzx;
    private boolean zzy;
    private com.google.android.gms.internal.ads.zzhbm zzz;

    static {
            com.google.android.gms.internal.ads.zzhfd r0 = new com.google.android.gms.internal.ads.zzhfd
            r0.<init>()
            com.google.android.gms.internal.ads.zzhfd.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzhfd> r1 = com.google.android.gms.internal.ads.zzhfd.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzhfd() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.zzf = r0
            com.google.android.gms.internal.ads.zzhbq r1 = com.google.android.gms.internal.ads.zzhbe.zzbK()
            r2.zzg = r1
            r2.zzl = r0
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbK()
            r2.zzu = r0
            com.google.android.gms.internal.ads.zzhbm r0 = com.google.android.gms.internal.ads.zzhbe.zzbG()
            r2.zzx = r0
            com.google.android.gms.internal.ads.zzhbm r0 = com.google.android.gms.internal.ads.zzhbe.zzbG()
            r2.zzz = r0
            return
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhfd zzc() {
            com.google.android.gms.internal.ads.zzhfd r0 = com.google.android.gms.internal.ads.zzhfd.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto Ld5;
                case 1: goto Ld4;
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzhfd.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzhfd> r3 = com.google.android.gms.internal.ads.zzhfd.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzhfd.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhfd r4 = com.google.android.gms.internal.ads.zzhfd.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzhfd.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzhfd r2 = com.google.android.gms.internal.ads.zzhfd.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzhew r2 = new com.google.android.gms.internal.ads.zzhew
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzhfd r2 = new com.google.android.gms.internal.ads.zzhfd
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 25
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "zzd"
            r3[r4] = r2
            r2 = 2
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzhfc.zza
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
            r2 = 6
            java.lang.String r4 = "zzh"
            r3[r2] = r4
            r2 = 7
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzhfa.zza
            r3[r2] = r4
            r2 = 8
            java.lang.String r4 = "zzi"
            r3[r2] = r4
            r2 = 9
            java.lang.String r4 = "zzj"
            r3[r2] = r4
            r2 = 10
            java.lang.String r4 = "zzk"
            r3[r2] = r4
            r2 = 11
            java.lang.String r4 = "zzl"
            r3[r2] = r4
            r2 = 12
            java.lang.String r4 = "zzm"
            r3[r2] = r4
            r2 = 13
            java.lang.String r4 = "zzn"
            r3[r2] = r4
            r2 = 14
            java.lang.String r4 = "zzo"
            r3[r2] = r4
            r2 = 15
            java.lang.String r4 = "zzp"
            r3[r2] = r4
            r2 = 16
            java.lang.String r4 = "zzu"
            r3[r2] = r4
            r2 = 17
            java.lang.Class<com.google.android.gms.internal.ads.zzhez> r4 = com.google.android.gms.internal.ads.zzhez.class
            r3[r2] = r4
            r2 = 18
            java.lang.String r4 = "zzv"
            r3[r2] = r4
            r2 = 19
            java.lang.String r4 = "zzw"
            r3[r2] = r4
            r2 = 20
            java.lang.String r4 = "zzx"
            r3[r2] = r4
            r2 = 21
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzhep.zza()
            r3[r2] = r4
            r2 = 22
            java.lang.String r4 = "zzy"
            r3[r2] = r4
            r2 = 23
            java.lang.String r4 = "zzz"
            r3[r2] = r4
            r2 = 24
            com.google.android.gms.internal.ads.zzhbk r4 = com.google.android.gms.internal.ads.zzhfb.zza
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzhfd r2 = com.google.android.gms.internal.ads.zzhfd.zza
            java.lang.String r4 = "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        Ld4:
            return r3
        Ld5:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
