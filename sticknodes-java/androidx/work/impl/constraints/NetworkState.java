package androidx.work.impl.constraints;

/* loaded from: classes.dex */
public class NetworkState {
    private boolean mIsConnected;
    private boolean mIsMetered;
    private boolean mIsNotRoaming;
    private boolean mIsValidated;

    public NetworkState(boolean r1, boolean r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mIsConnected = r1
            r0.mIsValidated = r2
            r0.mIsMetered = r3
            r0.mIsNotRoaming = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.work.impl.constraints.NetworkState
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.work.impl.constraints.NetworkState r5 = (androidx.work.impl.constraints.NetworkState) r5
            boolean r1 = r4.mIsConnected
            boolean r3 = r5.mIsConnected
            if (r1 != r3) goto L25
            boolean r1 = r4.mIsValidated
            boolean r3 = r5.mIsValidated
            if (r1 != r3) goto L25
            boolean r1 = r4.mIsMetered
            boolean r3 = r5.mIsMetered
            if (r1 != r3) goto L25
            boolean r1 = r4.mIsNotRoaming
            boolean r5 = r5.mIsNotRoaming
            if (r1 != r5) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.mIsConnected
            boolean r1 = r2.mIsValidated
            if (r1 == 0) goto L8
            int r0 = r0 + 16
        L8:
            boolean r1 = r2.mIsMetered
            if (r1 == 0) goto Le
            int r0 = r0 + 256
        Le:
            boolean r1 = r2.mIsNotRoaming
            if (r1 == 0) goto L14
            int r0 = r0 + 4096
        L14:
            return r0
    }

    public boolean isConnected() {
            r1 = this;
            boolean r0 = r1.mIsConnected
            return r0
    }

    public boolean isMetered() {
            r1 = this;
            boolean r0 = r1.mIsMetered
            return r0
    }

    public boolean isNotRoaming() {
            r1 = this;
            boolean r0 = r1.mIsNotRoaming
            return r0
    }

    public boolean isValidated() {
            r1 = this;
            boolean r0 = r1.mIsValidated
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r3.mIsConnected
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.mIsValidated
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.mIsMetered
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.mIsNotRoaming
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = "[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
