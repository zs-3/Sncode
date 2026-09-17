package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgws extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzgws zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzhbq zzd;

    static {
            com.google.android.gms.internal.ads.zzgws r0 = new com.google.android.gms.internal.ads.zzgws
            r0.<init>()
            com.google.android.gms.internal.ads.zzgws.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzgws> r1 = com.google.android.gms.internal.ads.zzgws.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzgws() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbK()
            r1.zzd = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgwp zza() {
            com.google.android.gms.internal.ads.zzgws r0 = com.google.android.gms.internal.ads.zzgws.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzgwp r0 = (com.google.android.gms.internal.ads.zzgwp) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzgws zzc() {
            com.google.android.gms.internal.ads.zzgws r0 = com.google.android.gms.internal.ads.zzgws.zza
            return r0
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzgws r0, int r1) {
            r0.zzc = r1
            return
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzgws r2, com.google.android.gms.internal.ads.zzgwr r3) {
            r3.getClass()
            com.google.android.gms.internal.ads.zzhbq r0 = r2.zzd
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L11
            com.google.android.gms.internal.ads.zzhbq r0 = com.google.android.gms.internal.ads.zzhbe.zzbL(r0)
            r2.zzd = r0
        L11:
            com.google.android.gms.internal.ads.zzhbq r2 = r2.zzd
            r2.add(r3)
            return
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
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgws.zzb
            if (r2 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzgws> r3 = com.google.android.gms.internal.ads.zzgws.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgws.zzb     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r2 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgws r4 = com.google.android.gms.internal.ads.zzgws.zza     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgws.zzb = r2     // Catch: java.lang.Throwable -> L25
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
            com.google.android.gms.internal.ads.zzgws r2 = com.google.android.gms.internal.ads.zzgws.zza
            return r2
        L2c:
            com.google.android.gms.internal.ads.zzgwp r2 = new com.google.android.gms.internal.ads.zzgwp
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.gms.internal.ads.zzgws r2 = new com.google.android.gms.internal.ads.zzgws
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
            java.lang.Class<com.google.android.gms.internal.ads.zzgwr> r4 = com.google.android.gms.internal.ads.zzgwr.class
            r3[r2] = r4
            com.google.android.gms.internal.ads.zzgws r2 = com.google.android.gms.internal.ads.zzgws.zza
            java.lang.String r4 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r4, r3)
            return r2
        L52:
            return r3
        L53:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
    }
}
