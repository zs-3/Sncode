package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgpd {
    public static final com.google.android.gms.internal.ads.zzgou zza = null;

    static {
            com.google.android.gms.internal.ads.zzgpc r0 = new com.google.android.gms.internal.ads.zzgpc
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgpd.zza = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgpa zza(com.google.android.gms.internal.ads.zzgqp r8) {
            com.google.android.gms.internal.ads.zzgow r0 = new com.google.android.gms.internal.ads.zzgow
            r0.<init>()
            com.google.android.gms.internal.ads.zzgot r1 = r8.zza()
            r0.zzb(r1)
            java.util.Collection r1 = r8.zze()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L14
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzgqn r3 = (com.google.android.gms.internal.ads.zzgqn) r3
            int r4 = r3.zzf()
            int r4 = r4 + (-2)
            r5 = 1
            if (r4 == r5) goto L4d
            r5 = 2
            if (r4 == r5) goto L4a
            r5 = 3
            if (r4 != r5) goto L42
            com.google.android.gms.internal.ads.zzghf r4 = com.google.android.gms.internal.ads.zzghf.zzc
            goto L4f
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown key status"
            r8.<init>(r0)
            throw r8
        L4a:
            com.google.android.gms.internal.ads.zzghf r4 = com.google.android.gms.internal.ads.zzghf.zzb
            goto L4f
        L4d:
            com.google.android.gms.internal.ads.zzghf r4 = com.google.android.gms.internal.ads.zzghf.zza
        L4f:
            int r5 = r3.zza()
            java.lang.String r6 = r3.zze()
            java.lang.String r7 = "type.googleapis.com/google.crypto."
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L65
            r7 = 34
            java.lang.String r6 = r6.substring(r7)
        L65:
            com.google.android.gms.internal.ads.zzgxf r3 = r3.zzb()
            java.lang.String r3 = r3.name()
            r0.zza(r4, r5, r6, r3)
            goto L24
        L71:
            com.google.android.gms.internal.ads.zzgqn r1 = r8.zzc()
            if (r1 == 0) goto L82
            com.google.android.gms.internal.ads.zzgqn r8 = r8.zzc()
            int r8 = r8.zza()
            r0.zzc(r8)
        L82:
            com.google.android.gms.internal.ads.zzgpa r8 = r0.zzd()     // Catch: java.security.GeneralSecurityException -> L87
            return r8
        L87:
            r8 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
    }
}
