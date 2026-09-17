package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzftb {
    final com.google.android.gms.internal.ads.zzfte zza;
    final boolean zzb;

    private zzftb(com.google.android.gms.internal.ads.zzfte r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzftb zzb(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r6 = "GASS"
            java.lang.String r0 = "com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger"
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r1 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "com.google.android.gms.ads.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r4, r1, r2)     // Catch: java.lang.Exception -> L39
            android.os.IBinder r0 = r1.instantiate(r0)     // Catch: java.lang.Exception -> L40
            r1 = 0
            if (r0 != 0) goto L15
            r2 = r1
            goto L27
        L15:
            java.lang.String r2 = "com.google.android.gms.gass.internal.clearcut.IGassClearcut"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)     // Catch: java.lang.Exception -> L40
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzfte     // Catch: java.lang.Exception -> L40
            if (r3 == 0) goto L22
            com.google.android.gms.internal.ads.zzfte r2 = (com.google.android.gms.internal.ads.zzfte) r2     // Catch: java.lang.Exception -> L40
            goto L27
        L22:
            com.google.android.gms.internal.ads.zzftc r2 = new com.google.android.gms.internal.ads.zzftc     // Catch: java.lang.Exception -> L40
            r2.<init>(r0)     // Catch: java.lang.Exception -> L40
        L27:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            r2.zze(r4, r5, r1)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            java.lang.String r4 = "GassClearcutLogger Initialized."
            android.util.Log.i(r6, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzftb r4 = new com.google.android.gms.internal.ads.zzftb     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            return r4
        L39:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzfsd r5 = new com.google.android.gms.internal.ads.zzfsd     // Catch: java.lang.Exception -> L40
            r5.<init>(r4)     // Catch: java.lang.Exception -> L40
            throw r5     // Catch: java.lang.Exception -> L40
        L40:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzfsd r5 = new com.google.android.gms.internal.ads.zzfsd     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
            throw r5     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47 java.lang.Throwable -> L47
        L47:
            java.lang.String r4 = "Cannot dynamite load clearcut"
            android.util.Log.d(r6, r4)
            com.google.android.gms.internal.ads.zzftf r4 = new com.google.android.gms.internal.ads.zzftf
            r4.<init>()
            com.google.android.gms.internal.ads.zzftb r5 = new com.google.android.gms.internal.ads.zzftb
            r5.<init>(r4)
            return r5
    }

    public static com.google.android.gms.internal.ads.zzftb zzc() {
            com.google.android.gms.internal.ads.zzftf r0 = new com.google.android.gms.internal.ads.zzftf
            r0.<init>()
            java.lang.String r1 = "GASS"
            java.lang.String r2 = "Clearcut logging disabled"
            android.util.Log.d(r1, r2)
            com.google.android.gms.internal.ads.zzftb r1 = new com.google.android.gms.internal.ads.zzftb
            r1.<init>(r0)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzfta zza(byte[] r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfta r0 = new com.google.android.gms.internal.ads.zzfta
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
