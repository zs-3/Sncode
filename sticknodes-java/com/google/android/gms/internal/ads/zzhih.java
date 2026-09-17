package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhih implements com.google.android.gms.internal.ads.zzhir, com.google.android.gms.internal.ads.zzhic {
    private static final java.lang.Object zza = null;
    private volatile com.google.android.gms.internal.ads.zzhir zzb;
    private volatile java.lang.Object zzc;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzhih.zza = r0
            return
    }

    private zzhih(com.google.android.gms.internal.ads.zzhir r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzhih.zza
            r1.zzc = r0
            r1.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzhic zza(com.google.android.gms.internal.ads.zzhir r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzhic
            if (r0 == 0) goto L7
            com.google.android.gms.internal.ads.zzhic r1 = (com.google.android.gms.internal.ads.zzhic) r1
            return r1
        L7:
            com.google.android.gms.internal.ads.zzhih r0 = new com.google.android.gms.internal.ads.zzhih
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzhir zzc(com.google.android.gms.internal.ads.zzhir r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzhih
            if (r0 == 0) goto L5
            return r1
        L5:
            com.google.android.gms.internal.ads.zzhih r0 = new com.google.android.gms.internal.ads.zzhih
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final java.lang.Object zzb() {
            r5 = this;
            java.lang.Object r0 = r5.zzc
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzhih.zza
            if (r0 != r1) goto L46
            monitor-enter(r5)
            java.lang.Object r0 = r5.zzc     // Catch: java.lang.Throwable -> L43
            if (r0 != r1) goto L41
            com.google.android.gms.internal.ads.zzhir r0 = r5.zzb     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.zzb()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = r5.zzc     // Catch: java.lang.Throwable -> L43
            if (r2 == r1) goto L3c
            if (r2 != r0) goto L18
            goto L3c
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "Scoped provider was invoked recursively returning different results: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            r3.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = " & "
            r3.append(r2)     // Catch: java.lang.Throwable -> L43
            r3.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = ". This is likely due to a circular dependency."
            r3.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L43
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L43
            throw r1     // Catch: java.lang.Throwable -> L43
        L3c:
            r5.zzc = r0     // Catch: java.lang.Throwable -> L43
            r1 = 0
            r5.zzb = r1     // Catch: java.lang.Throwable -> L43
        L41:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L43
            throw r0
        L46:
            return r0
    }
}
