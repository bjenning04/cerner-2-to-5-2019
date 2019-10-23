# cerner_2^5_2019

# Update installed Java versions configured in JEnv
rm -rf ~/.jenv/versions/*
jenv refresh-versions
for d in /Library/Java/JavaVirtualMachines/* ; do
    jenv add "$d/Contents/Home"
done