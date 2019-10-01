-- cerner_2^5_2019
-- Markov chain algorithm in Lua
math.randomseed(os.time())

function allwords ()
    local line, pos = io.read(), 1
    return function ()
        while line do
            local s, e = string.find(line, "%w+", pos)
            if s then
                pos = e + 1
                return string.sub(line, s, e)
            end
            line, pos = io.read(), 1
        end
        return nil
    end
end

function prefix(w1, w2) return w1 .. ' ' .. w2 end

local statetab, w1, w2 = {}, "\n", "\n"

function insert (index, value)
    if not statetab[index] then statetab[index] = {} end
    table.insert(statetab[index], value)
end
  
-- build table
for w in allwords() do
    insert(prefix(w1, w2), w)
    w1 = w2; w2 = w;
end
insert(prefix(w1, w2), "\n")

-- generate text
w1 = "\n"; w2 = "\n"
repeat
    local list = statetab[prefix(w1, w2)]; w1 = w2
    local nextword = list[math.random(#list)]; w2 = nextword
    io.write(nextword, " ")
until(nextword == "\n")