package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzq {
    public static android.content.Context zza(android.content.Context r0) throws com.google.android.gms.ads.internal.util.client.zzp {
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r0)
            android.content.Context r0 = r0.getModuleContext()
            return r0
    }

    public static java.lang.Object zzb(android.content.Context r0, java.lang.String r1, com.google.android.gms.ads.internal.util.client.zzo r2) throws com.google.android.gms.ads.internal.util.client.zzp {
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r0)     // Catch: java.lang.Exception -> Ld
            android.os.IBinder r0 = r0.instantiate(r1)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = move-exception
            com.google.android.gms.ads.internal.util.client.zzp r1 = new com.google.android.gms.ads.internal.util.client.zzp
            r1.<init>(r0)
            throw r1
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context r2) throws com.google.android.gms.ads.internal.util.client.zzp {
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r0 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L9
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r2 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r0, r1)     // Catch: java.lang.Exception -> L9
            return r2
        L9:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzp r0 = new com.google.android.gms.ads.internal.util.client.zzp
            r0.<init>(r2)
            throw r0
    }
}
