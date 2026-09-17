package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SaveAccountLinkingTokenResultCreator")
/* loaded from: classes.dex */
public class SaveAccountLinkingTokenResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final android.app.PendingIntent zba;

    static {
            com.google.android.gms.auth.api.identity.zbq r0 = new com.google.android.gms.auth.api.identity.zbq
            r0.<init>()
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public SaveAccountLinkingTokenResult(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.app.PendingIntent r1) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult r2 = (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult) r2
            android.app.PendingIntent r0 = r1.zba
            android.app.PendingIntent r2 = r2.zba
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            return r2
    }

    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zba
            return r0
    }

    public boolean hasResolution() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zba
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.app.PendingIntent r0 = r3.zba
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.app.PendingIntent r1 = r4.getPendingIntent()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
