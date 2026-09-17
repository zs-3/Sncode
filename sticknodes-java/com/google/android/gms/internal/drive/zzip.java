package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzip extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzio {
    public static com.google.android.gms.internal.drive.zzio zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.drive.zzio
            if (r1 == 0) goto L11
            com.google.android.gms.internal.drive.zzio r0 = (com.google.android.gms.internal.drive.zzio) r0
            return r0
        L11:
            com.google.android.gms.internal.drive.zziq r0 = new com.google.android.gms.internal.drive.zziq
            r0.<init>(r2)
            return r0
    }
}
