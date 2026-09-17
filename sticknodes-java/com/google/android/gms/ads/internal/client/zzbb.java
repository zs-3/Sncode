package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzbb {
    private static final com.google.android.gms.ads.internal.client.zzcp zza = null;

    static {
            r0 = 0
            java.lang.Class<com.google.android.gms.ads.internal.client.zzba> r1 = com.google.android.gms.ads.internal.client.zzba.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "com.google.android.gms.ads.internal.ClientApi"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Exception -> L3d
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3d
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L3d
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: java.lang.Exception -> L3d
            if (r2 != 0) goto L24
            java.lang.String r1 = "ClientApi class is not an instance of IBinder."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)     // Catch: java.lang.Exception -> L3d
            goto L42
        L24:
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: java.lang.Exception -> L3d
            if (r1 != 0) goto L29
            goto L42
        L29:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IClientApi"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: java.lang.Exception -> L3d
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzcp     // Catch: java.lang.Exception -> L3d
            if (r3 == 0) goto L37
            com.google.android.gms.ads.internal.client.zzcp r2 = (com.google.android.gms.ads.internal.client.zzcp) r2     // Catch: java.lang.Exception -> L3d
        L35:
            r0 = r2
            goto L42
        L37:
            com.google.android.gms.ads.internal.client.zzcn r2 = new com.google.android.gms.ads.internal.client.zzcn     // Catch: java.lang.Exception -> L3d
            r2.<init>(r1)     // Catch: java.lang.Exception -> L3d
            goto L35
        L3d:
            java.lang.String r1 = "Failed to instantiate ClientApi class."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
        L42:
            com.google.android.gms.ads.internal.client.zzbb.zza = r0
            return
    }

    zzbb() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Object zze() {
            r3 = this;
            com.google.android.gms.ads.internal.client.zzcp r0 = com.google.android.gms.ads.internal.client.zzbb.zza
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.Object r0 = r3.zzb(r0)     // Catch: android.os.RemoteException -> La
            return r0
        La:
            r0 = move-exception
            java.lang.String r2 = "Cannot invoke local loader using ClientApi class."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)
            return r1
        L11:
            java.lang.String r0 = "ClientApi class cannot be loaded."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return r1
    }

    private final java.lang.Object zzf() {
            r2 = this;
            java.lang.Object r0 = r2.zzc()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "Cannot invoke remote loader."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            r0 = 0
            return r0
    }

    protected abstract java.lang.Object zza();

    protected abstract java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r1) throws android.os.RemoteException;

    protected abstract java.lang.Object zzc() throws android.os.RemoteException;

    public final java.lang.Object zzd(android.content.Context r9, boolean r10) {
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L15
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzf.zzt(r9, r1)
            if (r1 != 0) goto L15
            java.lang.String r10 = "Google Play Services is not available."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r10)
            r10 = 1
        L15:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r9, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r9, r1)
            r3 = 0
            if (r2 <= r1) goto L24
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            r1 = r1 ^ r0
            com.google.android.gms.internal.ads.zzbcv.zza(r9)
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbem.zza
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L39
        L37:
            r10 = 0
            goto L4d
        L39:
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbem.zzb
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4a
            r10 = 1
            r3 = 1
            goto L4d
        L4a:
            r10 = r10 | r1
            r3 = r10
            goto L37
        L4d:
            if (r3 == 0) goto L5c
            java.lang.Object r9 = r8.zze()
            if (r9 != 0) goto La2
            if (r10 != 0) goto La2
            java.lang.Object r9 = r8.zzf()
            goto La2
        L5c:
            java.lang.Object r10 = r8.zzf()
            if (r10 != 0) goto L9a
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbfa.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.util.Random r2 = com.google.android.gms.ads.internal.client.zzbc.zze()
            int r1 = r2.nextInt(r1)
            if (r1 != 0) goto L9a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r6.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r6.putInt(r1, r0)
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = com.google.android.gms.ads.internal.client.zzbc.zzc()
            java.lang.String r4 = r0.afmaVersion
            r7 = 1
            java.lang.String r5 = "gmob-apps"
            r3 = r9
            r2.zzo(r3, r4, r5, r6, r7)
        L9a:
            if (r10 != 0) goto La1
            java.lang.Object r9 = r8.zze()
            goto La2
        La1:
            r9 = r10
        La2:
            if (r9 != 0) goto La8
            java.lang.Object r9 = r8.zza()
        La8:
            return r9
    }
}
