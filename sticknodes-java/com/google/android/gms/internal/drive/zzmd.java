package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzmd {
    private static final com.google.android.gms.internal.drive.zzmd zzuw = null;
    private final com.google.android.gms.internal.drive.zzmg zzux;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.drive.zzmf<?>> zzuy;

    static {
            com.google.android.gms.internal.drive.zzmd r0 = new com.google.android.gms.internal.drive.zzmd
            r0.<init>()
            com.google.android.gms.internal.drive.zzmd.zzuw = r0
            return
    }

    private zzmd() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzuy = r0
            com.google.android.gms.internal.drive.zzlf r0 = new com.google.android.gms.internal.drive.zzlf
            r0.<init>()
            r1.zzux = r0
            return
    }

    public static com.google.android.gms.internal.drive.zzmd zzej() {
            com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzuw
            return r0
    }

    public final <T> com.google.android.gms.internal.drive.zzmf<T> zzf(java.lang.Class<T> r3) {
            r2 = this;
            java.lang.String r0 = "messageType"
            com.google.android.gms.internal.drive.zzkm.zza(r3, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.drive.zzmf<?>> r1 = r2.zzuy
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.drive.zzmf r1 = (com.google.android.gms.internal.drive.zzmf) r1
            if (r1 != 0) goto L28
            com.google.android.gms.internal.drive.zzmg r1 = r2.zzux
            com.google.android.gms.internal.drive.zzmf r1 = r1.zze(r3)
            com.google.android.gms.internal.drive.zzkm.zza(r3, r0)
            java.lang.String r0 = "schema"
            com.google.android.gms.internal.drive.zzkm.zza(r1, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.drive.zzmf<?>> r0 = r2.zzuy
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            com.google.android.gms.internal.drive.zzmf r3 = (com.google.android.gms.internal.drive.zzmf) r3
            if (r3 == 0) goto L28
            r1 = r3
        L28:
            return r1
    }

    public final <T> com.google.android.gms.internal.drive.zzmf<T> zzq(T r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.drive.zzmf r1 = r0.zzf(r1)
            return r1
    }
}
