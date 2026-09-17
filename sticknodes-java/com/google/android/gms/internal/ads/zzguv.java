package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzguv extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzguv zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;
    private int zzc;

    static {
            com.google.android.gms.internal.ads.zzguv r0 = new com.google.android.gms.internal.ads.zzguv
            r0.<init>()
            com.google.android.gms.internal.ads.zzguv.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzguv> r1 = com.google.android.gms.internal.ads.zzguv.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzguv() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzguu zzc() {
            com.google.android.gms.internal.ads.zzguv r0 = com.google.android.gms.internal.ads.zzguv.zza
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzaZ()
            com.google.android.gms.internal.ads.zzguu r0 = (com.google.android.gms.internal.ads.zzguu) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzguv zzd() {
            com.google.android.gms.internal.ads.zzguv r0 = com.google.android.gms.internal.ads.zzguv.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzguv zze() {
            com.google.android.gms.internal.ads.zzguv r0 = com.google.android.gms.internal.ads.zzguv.zza
            return r0
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzguv r0, int r1) {
            r0.zzc = r1
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int r1 = r1.ordinal()
            r2 = 0
            r3 = 1
            switch(r1) {
                case 0: goto L49;
                case 1: goto L48;
                case 2: goto L38;
                case 3: goto L32;
                case 4: goto L2c;
                case 5: goto L29;
                case 6: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        Lf:
            com.google.android.gms.internal.ads.zzhcx r1 = com.google.android.gms.internal.ads.zzguv.zzb
            if (r1 != 0) goto L28
            java.lang.Class<com.google.android.gms.internal.ads.zzguv> r2 = com.google.android.gms.internal.ads.zzguv.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzhcx r1 = com.google.android.gms.internal.ads.zzguv.zzb     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L23
            com.google.android.gms.internal.ads.zzhaz r1 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzguv r3 = com.google.android.gms.internal.ads.zzguv.zza     // Catch: java.lang.Throwable -> L25
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzguv.zzb = r1     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r1
        L28:
            return r1
        L29:
            com.google.android.gms.internal.ads.zzguv r1 = com.google.android.gms.internal.ads.zzguv.zza
            return r1
        L2c:
            com.google.android.gms.internal.ads.zzguu r1 = new com.google.android.gms.internal.ads.zzguu
            r1.<init>(r2)
            return r1
        L32:
            com.google.android.gms.internal.ads.zzguv r1 = new com.google.android.gms.internal.ads.zzguv
            r1.<init>()
            return r1
        L38:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2 = 0
            java.lang.String r3 = "zzc"
            r1[r2] = r3
            com.google.android.gms.internal.ads.zzguv r2 = com.google.android.gms.internal.ads.zzguv.zza
            java.lang.String r3 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b"
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzhbe.zzbS(r2, r3, r1)
            return r1
        L48:
            return r2
        L49:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            return r1
    }
}
