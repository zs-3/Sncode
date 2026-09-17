package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgwv extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzgwv zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgwy zze;

    static {
            com.google.android.gms.internal.ads.zzgwv r0 = new com.google.android.gms.internal.ads.zzgwv
            r0.<init>()
            com.google.android.gms.internal.ads.zzgwv.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzgwv> r1 = com.google.android.gms.internal.ads.zzgwv.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzgwv() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzgwu zzc() {
            com.google.android.gms.internal.ads.zzgwv r0 = com.google.android.gms.internal.ads.zzgwv.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzgwu r0 = (com.google.android.gms.internal.ads.zzgwu) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzgwv zzd() {
            com.google.android.gms.internal.ads.zzgwv r0 = com.google.android.gms.internal.ads.zzgwv.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgwv zze(com.google.android.gms.internal.ads.zzgzs r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzgwv r0 = com.google.android.gms.internal.ads.zzgwv.zza
            com.google.android.gms.internal.ads.zzhbe r1 = com.google.android.gms.internal.ads.zzhbe.zzbr(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgwv r1 = (com.google.android.gms.internal.ads.zzgwv) r1
            return r1
    }

    public static com.google.android.gms.internal.ads.zzhcx zzg() {
            com.google.android.gms.internal.ads.zzgwv r0 = com.google.android.gms.internal.ads.zzgwv.zza
            com.google.android.gms.internal.ads.zzhcx r0 = r0.zzbN()
            return r0
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzgwv r0, com.google.android.gms.internal.ads.zzgwy r1) {
            r1.getClass()
            r0.zze = r1
            int r1 = r0.zzc
            r1 = r1 | 1
            r0.zzc = r1
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L53;
                case 1: goto L52;
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgwv.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzgwv> r3 = com.google.android.gms.internal.ads.zzgwv.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgwv.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgwv r4 = com.google.android.gms.internal.ads.zzgwv.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgwv.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzgwv r2 = com.google.android.gms.internal.ads.zzgwv.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzgwu r2 = new com.google.android.gms.internal.ads.zzgwu
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzgwv r2 = new com.google.android.gms.internal.ads.zzgwv
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "zzd"
            r3[r4] = r2
            r2 = 2
            java.lang.String r4 = "zze"
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzgwv r2 = com.google.android.gms.internal.ads.zzgwv.zza
            java.lang.String r4 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L52:
            return r3
        L53:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgwy zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgwy r0 = r1.zze
            if (r0 != 0) goto L8
            com.google.android.gms.internal.ads.zzgwy r0 = com.google.android.gms.internal.ads.zzgwy.zzd()
        L8:
            return r0
    }
}
