package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public class StrictPolicy implements com.google.android.vending.licensing.Policy {
    private int mLastResponse;

    public StrictPolicy() {
            r1 = this;
            r1.<init>()
            r0 = 291(0x123, float:4.08E-43)
            r1.mLastResponse = r0
            return
    }

    @Override // com.google.android.vending.licensing.Policy
    public boolean allowAccess() {
            r2 = this;
            int r0 = r2.mLastResponse
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.android.vending.licensing.Policy
    public void processServerResponse(int r1, com.google.android.vending.licensing.ResponseData r2) {
            r0 = this;
            r0.mLastResponse = r1
            return
    }
}
