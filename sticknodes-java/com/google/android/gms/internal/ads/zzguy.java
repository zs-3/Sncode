package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzguy extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzguy zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgzs zzd;

    static {
            com.google.android.gms.internal.ads.zzguy r0 = new com.google.android.gms.internal.ads.zzguy
            r0.<init>()
            com.google.android.gms.internal.ads.zzguy.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzguy> r1 = com.google.android.gms.internal.ads.zzguy.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzguy() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzb
            r1.zzd = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgux zzc() {
            com.google.android.gms.internal.ads.zzguy r0 = com.google.android.gms.internal.ads.zzguy.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzgux r0 = (com.google.android.gms.internal.ads.zzgux) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzguy zzd() {
            com.google.android.gms.internal.ads.zzguy r0 = com.google.android.gms.internal.ads.zzguy.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzguy zze(com.google.android.gms.internal.ads.zzgzs r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzguy r0 = com.google.android.gms.internal.ads.zzguy.zza
            com.google.android.gms.internal.ads.zzhbe r1 = com.google.android.gms.internal.ads.zzhbe.zzbr(r0, r1, r2)
            com.google.android.gms.internal.ads.zzguy r1 = (com.google.android.gms.internal.ads.zzguy) r1
            return r1
    }

    public static com.google.android.gms.internal.ads.zzhcx zzg() {
            com.google.android.gms.internal.ads.zzguy r0 = com.google.android.gms.internal.ads.zzguy.zza
            com.google.android.gms.internal.ads.zzhcx r0 = r0.zzbN()
            return r0
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzguy r0, com.google.android.gms.internal.ads.zzgzs r1) {
            r0.zzd = r1
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            switch(r2) {
                case 0: goto L4e;
                case 1: goto L4d;
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzguy.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzguy> r3 = com.google.android.gms.internal.ads.zzguy.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzguy.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzguy r4 = com.google.android.gms.internal.ads.zzguy.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzguy.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzguy r2 = com.google.android.gms.internal.ads.zzguy.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzgux r2 = new com.google.android.gms.internal.ads.zzgux
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzguy r2 = new com.google.android.gms.internal.ads.zzguy
            r2.<init>()
            return r2
        L38:
            java.lang.String r2 = "zzc"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "zzd"
            r3[r4] = r2
            com.google.android.gms.internal.ads.zzguy r2 = com.google.android.gms.internal.ads.zzguy.zza
            java.lang.String r4 = "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L4d:
            return r3
        L4e:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgzs zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzd
            return r0
    }
}
