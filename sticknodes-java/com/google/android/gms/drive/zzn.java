package com.google.android.gms.drive;

@com.google.android.gms.common.internal.ShowFirstParty
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzn extends com.google.android.gms.drive.ExecutionOptions {
    private boolean zzat;

    private zzn(java.lang.String r1, boolean r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.zzat = r4
            return
    }

    /* synthetic */ zzn(java.lang.String r1, boolean r2, int r3, boolean r4, com.google.android.gms.drive.zzo r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.android.gms.drive.zzn zza(com.google.android.gms.drive.ExecutionOptions r2) {
            com.google.android.gms.drive.zzp r0 = new com.google.android.gms.drive.zzp
            r0.<init>()
            if (r2 == 0) goto L1e
            int r1 = r2.zzn()
            r0.setConflictStrategy(r1)
            boolean r1 = r2.zzm()
            r0.setNotifyOnCompletion(r1)
            java.lang.String r2 = r2.zzl()
            if (r2 == 0) goto L1e
            r0.setTrackingTag(r2)
        L1e:
            com.google.android.gms.drive.ExecutionOptions r2 = r0.build()
            com.google.android.gms.drive.zzn r2 = (com.google.android.gms.drive.zzn) r2
            return r2
    }

    public final boolean zzp() {
            r1 = this;
            boolean r0 = r1.zzat
            return r0
    }
}
