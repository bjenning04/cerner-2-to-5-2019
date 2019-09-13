# cerner_2^5_2019

# Install command line tools
xcode-select --install

# Install Homebrew
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

# Homebrew formulas to install
formulae=(
    cocoapods
    git-lfs
    gradle
    jenv
    mas
    maven
)
brew install ${formulae[@]}

# Homebrew casks to install
brew tap caskroom/versions
casks=(
    adoptopenjdk8
    android-studio
    google-chrome
    intellij-idea-ce
    kaleidoscope
    visual-studio-code
)
brew cask install ${casks[@]}
brew cleanup

# Set up Java environment
echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.bash_profile
echo 'eval "$(jenv init -)"' >> ~/.bash_profile
source ~/.bash_profile
for d in /Library/Java/JavaVirtualMachines/* ; do
    jenv add "$d/Contents/Home"
done

# Install applications from Mac App Store
mas signin bjenning04@gmail.com
# Install Magnet
mas install 441258766
# Install Paste
mas install 967805235
# Install Xcode
mas install 497799835