package androidx.fragment.app.strictmode;

/* compiled from: FragmentStrictMode.kt */
/* loaded from: classes.dex */
public final class FragmentStrictMode {
    public static final androidx.fragment.app.strictmode.FragmentStrictMode INSTANCE = null;
    private static androidx.fragment.app.strictmode.FragmentStrictMode.Policy defaultPolicy;

    /* compiled from: FragmentStrictMode.kt */
    public enum Flag extends java.lang.Enum<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> {
        private static final /* synthetic */ androidx.fragment.app.strictmode.FragmentStrictMode.Flag[] $VALUES = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_FRAGMENT_REUSE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_FRAGMENT_TAG_USAGE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_RETAIN_INSTANCE_USAGE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_SET_USER_VISIBLE_HINT = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_TARGET_FRAGMENT_USAGE = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag DETECT_WRONG_FRAGMENT_CONTAINER = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag PENALTY_DEATH = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Flag PENALTY_LOG = null;

        private static final /* synthetic */ androidx.fragment.app.strictmode.FragmentStrictMode.Flag[] $values() {
                r0 = 8
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = new androidx.fragment.app.strictmode.FragmentStrictMode.Flag[r0]
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG
                r2 = 0
                r0[r2] = r1
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH
                r2 = 1
                r0[r2] = r1
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE
                r2 = 2
                r0[r2] = r1
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE
                r2 = 3
                r0[r2] = r1
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE
                r2 = 4
                r0[r2] = r1
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT
                r2 = 5
                r0[r2] = r1
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
                r2 = 6
                r0[r2] = r1
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER
                r2 = 7
                r0[r2] = r1
                return r0
        }

        static {
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "PENALTY_LOG"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "PENALTY_DEATH"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_FRAGMENT_REUSE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_FRAGMENT_TAG_USAGE"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_RETAIN_INSTANCE_USAGE"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_SET_USER_VISIBLE_HINT"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_TARGET_FRAGMENT_USAGE"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Flag
                java.lang.String r1 = "DETECT_WRONG_FRAGMENT_CONTAINER"
                r2 = 7
                r0.<init>(r1, r2)
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = $values()
                androidx.fragment.app.strictmode.FragmentStrictMode.Flag.$VALUES = r0
                return
        }

        Flag(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.fragment.app.strictmode.FragmentStrictMode.Flag valueOf(java.lang.String r1) {
                java.lang.Class<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag r1 = (androidx.fragment.app.strictmode.FragmentStrictMode.Flag) r1
                return r1
        }

        public static androidx.fragment.app.strictmode.FragmentStrictMode.Flag[] values() {
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.fragment.app.strictmode.FragmentStrictMode$Flag[] r0 = (androidx.fragment.app.strictmode.FragmentStrictMode.Flag[]) r0
                return r0
        }
    }

    /* compiled from: FragmentStrictMode.kt */
    public interface OnViolationListener {
        void onViolation(androidx.fragment.app.strictmode.Violation r1);
    }

    /* compiled from: FragmentStrictMode.kt */
    public static final class Policy {
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Companion Companion = null;
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Policy LAX = null;
        private final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> flags;
        private final androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener listener;
        private final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> mAllowedViolations;

        /* compiled from: FragmentStrictMode.kt */
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                androidx.fragment.app.strictmode.FragmentStrictMode$Policy$Companion r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Policy$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Companion = r0
                androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = new androidx.fragment.app.strictmode.FragmentStrictMode$Policy
                java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
                java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
                r0.<init>(r2, r1, r3)
                androidx.fragment.app.strictmode.FragmentStrictMode.Policy.LAX = r0
                return
        }

        public Policy(java.util.Set<? extends androidx.fragment.app.strictmode.FragmentStrictMode.Flag> r2, androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener r3, java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> r4) {
                r1 = this;
                java.lang.String r0 = "flags"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "allowedViolations"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.flags = r2
                r1.listener = r3
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r3 = r4.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L1e:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L3a
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r4 = r4.getValue()
                java.util.Set r4 = (java.util.Set) r4
                r2.put(r0, r4)
                goto L1e
            L3a:
                r1.mAllowedViolations = r2
                return
        }

        public final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> getFlags$fragment_release() {
                r1 = this;
                java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode$Flag> r0 = r1.flags
                return r0
        }

        public final androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener getListener$fragment_release() {
                r1 = this;
                androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r0 = r1.listener
                return r0
        }

        public final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> getMAllowedViolations$fragment_release() {
                r1 = this;
                java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> r0 = r1.mAllowedViolations
                return r0
        }
    }

    /* renamed from: $r8$lambda$3GEKar9k4mm28McDHO-XTHzF5lU, reason: not valid java name */
    public static /* synthetic */ void m12$r8$lambda$3GEKar9k4mm28McDHOXTHzF5lU(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r0, androidx.fragment.app.strictmode.Violation r1) {
            m13handlePolicyViolation$lambda0(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ujbeN2H_kHMJp2XfgBvtZfltiz0(java.lang.String r0, androidx.fragment.app.strictmode.Violation r1) {
            m14handlePolicyViolation$lambda1(r0, r1)
            return
    }

    static {
            androidx.fragment.app.strictmode.FragmentStrictMode r0 = new androidx.fragment.app.strictmode.FragmentStrictMode
            r0.<init>()
            androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE = r0
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = androidx.fragment.app.strictmode.FragmentStrictMode.Policy.LAX
            androidx.fragment.app.strictmode.FragmentStrictMode.defaultPolicy = r0
            return
    }

    private FragmentStrictMode() {
            r0 = this;
            r0.<init>()
            return
    }

    private final androidx.fragment.app.strictmode.FragmentStrictMode.Policy getNearestPolicy(androidx.fragment.app.Fragment r3) {
            r2 = this;
        L0:
            if (r3 == 0) goto L24
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager r0 = r3.getParentFragmentManager()
            java.lang.String r1 = "declaringFragment.parentFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r0.getStrictModePolicy()
            if (r1 == 0) goto L1f
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r3 = r0.getStrictModePolicy()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            return r3
        L1f:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L0
        L24:
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r3 = androidx.fragment.app.strictmode.FragmentStrictMode.defaultPolicy
            return r3
    }

    private final void handlePolicyViolation(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r5, androidx.fragment.app.strictmode.Violation r6) {
            r4 = this;
            androidx.fragment.app.Fragment r0 = r6.getFragment()
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.util.Set r2 = r5.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Policy violation in "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentStrictMode"
            android.util.Log.d(r3, r2, r6)
        L2e:
            androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r2 = r5.getListener$fragment_release()
            if (r2 == 0) goto L3c
            androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda0 r2 = new androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda0
            r2.<init>(r5, r6)
            r4.runOnHostThread(r0, r2)
        L3c:
            java.util.Set r5 = r5.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r2 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L50
            androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda1 r5 = new androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda1
            r5.<init>(r1, r6)
            r4.runOnHostThread(r0, r5)
        L50:
            return
    }

    /* renamed from: handlePolicyViolation$lambda-0, reason: not valid java name */
    private static final void m13handlePolicyViolation$lambda0(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r1, androidx.fragment.app.strictmode.Violation r2) {
            java.lang.String r0 = "$policy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$violation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$OnViolationListener r1 = r1.getListener$fragment_release()
            r1.onViolation(r2)
            return
    }

    /* renamed from: handlePolicyViolation$lambda-1, reason: not valid java name */
    private static final void m14handlePolicyViolation$lambda1(java.lang.String r2, androidx.fragment.app.strictmode.Violation r3) {
            java.lang.String r0 = "$violation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Policy violation with PENALTY_DEATH in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "FragmentStrictMode"
            android.util.Log.e(r0, r2, r3)
            throw r3
    }

    private final void logIfDebuggingEnabled(androidx.fragment.app.strictmode.Violation r3) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StrictMode violation in "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0, r3)
        L29:
            return
    }

    public static final void onFragmentReuse(androidx.fragment.app.Fragment r4, java.lang.String r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "previousFragmentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.FragmentReuseViolation r0 = new androidx.fragment.app.strictmode.FragmentReuseViolation
            r0.<init>(r4, r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r5 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r5.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r5.getNearestPolicy(r4)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L35
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r2 = r0.getClass()
            boolean r4 = r5.shouldHandlePolicyViolation(r1, r4, r2)
            if (r4 == 0) goto L35
            r5.handlePolicyViolation(r1, r0)
        L35:
            return
    }

    public static final void onFragmentTagUsage(androidx.fragment.app.Fragment r4, android.view.ViewGroup r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.fragment.app.strictmode.FragmentTagUsageViolation r0 = new androidx.fragment.app.strictmode.FragmentTagUsageViolation
            r0.<init>(r4, r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r5 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r5.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r5.getNearestPolicy(r4)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L30
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r2 = r0.getClass()
            boolean r4 = r5.shouldHandlePolicyViolation(r1, r4, r2)
            if (r4 == 0) goto L30
            r5.handlePolicyViolation(r1, r0)
        L30:
            return
    }

    public static final void onGetRetainInstanceUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation r0 = new androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r2 = r1.getNearestPolicy(r5)
            java.util.Set r3 = r2.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r4 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L30
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r3 = r0.getClass()
            boolean r5 = r1.shouldHandlePolicyViolation(r2, r5, r3)
            if (r5 == 0) goto L30
            r1.handlePolicyViolation(r2, r0)
        L30:
            return
    }

    public static final void onGetTargetFragmentRequestCodeUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation r0 = new androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r2 = r1.getNearestPolicy(r5)
            java.util.Set r3 = r2.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r4 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L30
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r3 = r0.getClass()
            boolean r5 = r1.shouldHandlePolicyViolation(r2, r5, r3)
            if (r5 == 0) goto L30
            r1.handlePolicyViolation(r2, r0)
        L30:
            return
    }

    public static final void onGetTargetFragmentUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation r0 = new androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r2 = r1.getNearestPolicy(r5)
            java.util.Set r3 = r2.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r4 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L30
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r3 = r0.getClass()
            boolean r5 = r1.shouldHandlePolicyViolation(r2, r5, r3)
            if (r5 == 0) goto L30
            r1.handlePolicyViolation(r2, r0)
        L30:
            return
    }

    public static final void onSetRetainInstanceUsage(androidx.fragment.app.Fragment r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation r0 = new androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation
            r0.<init>(r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r1 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r1.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r2 = r1.getNearestPolicy(r5)
            java.util.Set r3 = r2.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r4 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L30
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r3 = r0.getClass()
            boolean r5 = r1.shouldHandlePolicyViolation(r2, r5, r3)
            if (r5 == 0) goto L30
            r1.handlePolicyViolation(r2, r0)
        L30:
            return
    }

    public static final void onSetTargetFragmentUsage(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, int r5) {
            java.lang.String r0 = "violatingFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "targetFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation r0 = new androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation
            r0.<init>(r3, r4, r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r4 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r4.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r5 = r4.getNearestPolicy(r3)
            java.util.Set r1 = r5.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r2 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L35
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r1 = r0.getClass()
            boolean r3 = r4.shouldHandlePolicyViolation(r5, r3, r1)
            if (r3 == 0) goto L35
            r4.handlePolicyViolation(r5, r0)
        L35:
            return
    }

    public static final void onSetUserVisibleHint(androidx.fragment.app.Fragment r4, boolean r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.fragment.app.strictmode.SetUserVisibleHintViolation r0 = new androidx.fragment.app.strictmode.SetUserVisibleHintViolation
            r0.<init>(r4, r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r5 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r5.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r5.getNearestPolicy(r4)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L30
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r2 = r0.getClass()
            boolean r4 = r5.shouldHandlePolicyViolation(r1, r4, r2)
            if (r4 == 0) goto L30
            r5.handlePolicyViolation(r1, r0)
        L30:
            return
    }

    public static final void onWrongFragmentContainer(androidx.fragment.app.Fragment r4, android.view.ViewGroup r5) {
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.fragment.app.strictmode.WrongFragmentContainerViolation r0 = new androidx.fragment.app.strictmode.WrongFragmentContainerViolation
            r0.<init>(r4, r5)
            androidx.fragment.app.strictmode.FragmentStrictMode r5 = androidx.fragment.app.strictmode.FragmentStrictMode.INSTANCE
            r5.logIfDebuggingEnabled(r0)
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r1 = r5.getNearestPolicy(r4)
            java.util.Set r2 = r1.getFlags$fragment_release()
            androidx.fragment.app.strictmode.FragmentStrictMode$Flag r3 = androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L35
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r2 = r0.getClass()
            boolean r4 = r5.shouldHandlePolicyViolation(r1, r4, r2)
            if (r4 == 0) goto L35
            r5.handlePolicyViolation(r1, r0)
        L35:
            return
    }

    private final void runOnHostThread(androidx.fragment.app.Fragment r3, java.lang.Runnable r4) {
            r2 = this;
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L2d
            androidx.fragment.app.FragmentManager r3 = r3.getParentFragmentManager()
            androidx.fragment.app.FragmentHostCallback r3 = r3.getHost()
            android.os.Handler r3 = r3.getHandler()
            java.lang.String r0 = "fragment.parentFragmentManager.host.handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            android.os.Looper r0 = r3.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L29
            r4.run()
            goto L30
        L29:
            r3.post(r4)
            goto L30
        L2d:
            r4.run()
        L30:
            return
    }

    private final boolean shouldHandlePolicyViolation(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r3, java.lang.Class<? extends androidx.fragment.app.Fragment> r4, java.lang.Class<? extends androidx.fragment.app.strictmode.Violation> r5) {
            r2 = this;
            java.lang.String r4 = r4.getName()
            java.util.Map r3 = r3.getMAllowedViolations$fragment_release()
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            r4 = 1
            if (r3 != 0) goto L12
            return r4
        L12:
            java.lang.Class r0 = r5.getSuperclass()
            java.lang.Class<androidx.fragment.app.strictmode.Violation> r1 = androidx.fragment.app.strictmode.Violation.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L2a
            java.lang.Class r0 = r5.getSuperclass()
            boolean r0 = kotlin.collections.CollectionsKt.contains(r3, r0)
            if (r0 == 0) goto L2a
            r3 = 0
            return r3
        L2a:
            boolean r3 = r3.contains(r5)
            r3 = r3 ^ r4
            return r3
    }
}
