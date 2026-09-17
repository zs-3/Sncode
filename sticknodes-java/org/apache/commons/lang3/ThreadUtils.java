package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class ThreadUtils {
    public static final org.apache.commons.lang3.ThreadUtils.AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = null;

    /* renamed from: org.apache.commons.lang3.ThreadUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class AlwaysTruePredicate implements org.apache.commons.lang3.ThreadUtils.ThreadPredicate, org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate {
        private AlwaysTruePredicate() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AlwaysTruePredicate(org.apache.commons.lang3.ThreadUtils.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(java.lang.Thread r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(java.lang.ThreadGroup r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    public static class NamePredicate implements org.apache.commons.lang3.ThreadUtils.ThreadPredicate, org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate {
        private final java.lang.String name;

        public NamePredicate(java.lang.String r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                if (r4 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "The name must not be null"
                org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
                r3.name = r4
                return
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(java.lang.Thread r2) {
                r1 = this;
                if (r2 == 0) goto L10
                java.lang.String r2 = r2.getName()
                java.lang.String r0 = r1.name
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(java.lang.ThreadGroup r2) {
                r1 = this;
                if (r2 == 0) goto L10
                java.lang.String r2 = r2.getName()
                java.lang.String r0 = r1.name
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }
    }

    @java.lang.FunctionalInterface
    public interface ThreadGroupPredicate {
        boolean test(java.lang.ThreadGroup r1);
    }

    public static class ThreadIdPredicate implements org.apache.commons.lang3.ThreadUtils.ThreadPredicate {
        private final long threadId;

        public ThreadIdPredicate(long r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lc
                r3.threadId = r4
                return
            Lc:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "The thread id must be greater than zero"
                r4.<init>(r5)
                throw r4
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(java.lang.Thread r5) {
                r4 = this;
                if (r5 == 0) goto Le
                long r0 = r5.getId()
                long r2 = r4.threadId
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Le
                r5 = 1
                goto Lf
            Le:
                r5 = 0
            Lf:
                return r5
        }
    }

    @java.lang.FunctionalInterface
    public interface ThreadPredicate {
        boolean test(java.lang.Thread r1);
    }

    static {
            org.apache.commons.lang3.ThreadUtils$AlwaysTruePredicate r0 = new org.apache.commons.lang3.ThreadUtils$AlwaysTruePredicate
            r1 = 0
            r0.<init>(r1)
            org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE_PREDICATE = r0
            return
    }

    public ThreadUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Thread findThreadById(long r1) {
            org.apache.commons.lang3.ThreadUtils$ThreadIdPredicate r0 = new org.apache.commons.lang3.ThreadUtils$ThreadIdPredicate
            r0.<init>(r1)
            java.util.Collection r1 = findThreads(r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L11
            r1 = 0
            goto L1b
        L11:
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Thread r1 = (java.lang.Thread) r1
        L1b:
            return r1
    }

    public static java.lang.Thread findThreadById(long r3, java.lang.String r5) {
            r0 = 0
            if (r5 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The thread group name must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            java.lang.Thread r3 = findThreadById(r3)
            if (r3 == 0) goto L28
            java.lang.ThreadGroup r4 = r3.getThreadGroup()
            if (r4 == 0) goto L28
            java.lang.ThreadGroup r4 = r3.getThreadGroup()
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L28
            return r3
        L28:
            r3 = 0
            return r3
    }

    public static java.lang.Thread findThreadById(long r3, java.lang.ThreadGroup r5) {
            r0 = 0
            if (r5 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The thread group must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            java.lang.Thread r3 = findThreadById(r3)
            if (r3 == 0) goto L1e
            java.lang.ThreadGroup r4 = r3.getThreadGroup()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L1e
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(java.lang.ThreadGroup r5, boolean r6, org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate r7) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The group must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r7 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The predicate must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            int r2 = r5.activeGroupCount()
        L1e:
            int r3 = r2 / 2
            int r2 = r2 + r3
            int r2 = r2 + r0
            java.lang.ThreadGroup[] r3 = new java.lang.ThreadGroup[r2]
            int r4 = r5.enumerate(r3, r6)
            if (r4 >= r2) goto L46
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
        L2f:
            if (r1 >= r4) goto L41
            r6 = r3[r1]
            boolean r6 = r7.test(r6)
            if (r6 == 0) goto L3e
            r6 = r3[r1]
            r5.add(r6)
        L3e:
            int r1 = r1 + 1
            goto L2f
        L41:
            java.util.Collection r5 = java.util.Collections.unmodifiableCollection(r5)
            return r5
        L46:
            r2 = r4
            goto L1e
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate r2) {
            java.lang.ThreadGroup r0 = getSystemThreadGroup()
            r1 = 1
            java.util.Collection r2 = findThreadGroups(r0, r1, r2)
            return r2
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroupsByName(java.lang.String r1) {
            org.apache.commons.lang3.ThreadUtils$NamePredicate r0 = new org.apache.commons.lang3.ThreadUtils$NamePredicate
            r0.<init>(r1)
            java.util.Collection r1 = findThreadGroups(r0)
            return r1
    }

    public static java.util.Collection<java.lang.Thread> findThreads(java.lang.ThreadGroup r5, boolean r6, org.apache.commons.lang3.ThreadUtils.ThreadPredicate r7) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The group must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r7 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The predicate must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            int r2 = r5.activeCount()
        L1e:
            int r3 = r2 / 2
            int r2 = r2 + r3
            int r2 = r2 + r0
            java.lang.Thread[] r3 = new java.lang.Thread[r2]
            int r4 = r5.enumerate(r3, r6)
            if (r4 >= r2) goto L46
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
        L2f:
            if (r1 >= r4) goto L41
            r6 = r3[r1]
            boolean r6 = r7.test(r6)
            if (r6 == 0) goto L3e
            r6 = r3[r1]
            r5.add(r6)
        L3e:
            int r1 = r1 + 1
            goto L2f
        L41:
            java.util.Collection r5 = java.util.Collections.unmodifiableCollection(r5)
            return r5
        L46:
            r2 = r4
            goto L1e
    }

    public static java.util.Collection<java.lang.Thread> findThreads(org.apache.commons.lang3.ThreadUtils.ThreadPredicate r2) {
            java.lang.ThreadGroup r0 = getSystemThreadGroup()
            r1 = 1
            java.util.Collection r2 = findThreads(r0, r1, r2)
            return r2
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String r1) {
            org.apache.commons.lang3.ThreadUtils$NamePredicate r0 = new org.apache.commons.lang3.ThreadUtils$NamePredicate
            r0.<init>(r1)
            java.util.Collection r1 = findThreads(r0)
            return r1
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The thread name must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r6 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "The thread group name must not be null"
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r2)
            org.apache.commons.lang3.ThreadUtils$NamePredicate r0 = new org.apache.commons.lang3.ThreadUtils$NamePredicate
            r0.<init>(r6)
            java.util.Collection r6 = findThreadGroups(r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L2d
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L2d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.commons.lang3.ThreadUtils$NamePredicate r2 = new org.apache.commons.lang3.ThreadUtils$NamePredicate
            r2.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L3b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4f
            java.lang.Object r6 = r5.next()
            java.lang.ThreadGroup r6 = (java.lang.ThreadGroup) r6
            java.util.Collection r6 = findThreads(r6, r1, r2)
            r0.addAll(r6)
            goto L3b
        L4f:
            java.util.Collection r5 = java.util.Collections.unmodifiableCollection(r0)
            return r5
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String r1, java.lang.ThreadGroup r2) {
            org.apache.commons.lang3.ThreadUtils$NamePredicate r0 = new org.apache.commons.lang3.ThreadUtils$NamePredicate
            r0.<init>(r1)
            r1 = 0
            java.util.Collection r1 = findThreads(r2, r1, r0)
            return r1
    }

    public static java.util.Collection<java.lang.ThreadGroup> getAllThreadGroups() {
            org.apache.commons.lang3.ThreadUtils$AlwaysTruePredicate r0 = org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE_PREDICATE
            java.util.Collection r0 = findThreadGroups(r0)
            return r0
    }

    public static java.util.Collection<java.lang.Thread> getAllThreads() {
            org.apache.commons.lang3.ThreadUtils$AlwaysTruePredicate r0 = org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE_PREDICATE
            java.util.Collection r0 = findThreads(r0)
            return r0
    }

    public static java.lang.ThreadGroup getSystemThreadGroup() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r0 = r0.getThreadGroup()
        L8:
            java.lang.ThreadGroup r1 = r0.getParent()
            if (r1 == 0) goto L13
            java.lang.ThreadGroup r0 = r0.getParent()
            goto L8
        L13:
            return r0
    }
}
