package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public abstract class zzev extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzeu {
    public static com.google.android.gms.internal.drive.zzeu zza(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.drive.internal.IEventReleaseCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.drive.zzeu
            if (r1 == 0) goto L11
            com.google.android.gms.internal.drive.zzeu r0 = (com.google.android.gms.internal.drive.zzeu) r0
            return r0
        L11:
            com.google.android.gms.internal.drive.zzew r0 = new com.google.android.gms.internal.drive.zzew
            r0.<init>(r2)
            return r0
    }
}
