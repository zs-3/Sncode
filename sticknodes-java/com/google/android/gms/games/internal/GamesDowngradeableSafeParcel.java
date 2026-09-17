package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public abstract class GamesDowngradeableSafeParcel extends com.google.android.gms.common.internal.DowngradeableSafeParcel {
    public GamesDowngradeableSafeParcel() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static boolean zzp(java.lang.Integer r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.intValue()
            boolean r0 = com.google.android.gms.common.util.GmsVersion.isAtLeastFenacho(r0)
            return r0
    }

    @Override // com.google.android.gms.common.internal.DowngradeableSafeParcel
    public final boolean prepareForClientVersion(int r2) {
            r1 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = zzp(r2)
            r0 = 1
            r2 = r2 ^ r0
            r1.setShouldDowngrade(r2)
            return r0
    }
}
